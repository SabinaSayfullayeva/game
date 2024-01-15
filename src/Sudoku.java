import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku= new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j]=0;
            }

        }


                sudoku[0][3]=3;
                sudoku[0][4]=9;
                sudoku[1][0]=5;
                sudoku[1][2]=1;
                sudoku[1][7]=4;
                sudoku[2][0]=9;
                sudoku[2][3]=7;
                sudoku[2][6]=5;
                sudoku[3][0]=6;
                sudoku[3][2]=2;
                sudoku[3][3]=5;
                sudoku[3][4]=3;
                sudoku[3][7]=7;
                sudoku[4][4]=7;
                sudoku[4][8]=8;
                sudoku[5][0]=7;
                sudoku[5][3]=8;
                sudoku[5][6]=9;
                sudoku[5][8]=3;
                sudoku[6][0]=8;
                sudoku[6][2]=3;
                sudoku[6][4]=1;
                sudoku[6][7]=9;
                sudoku[7][1]=9;
                sudoku[7][3]=2;
                sudoku[7][5]=6;
                sudoku[7][8]=7;
                sudoku[8][0]=4;
                sudoku[8][5]=3;
                sudoku[8][7]=6;
                sudoku[8][8]=1;


                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print(sudoku[i][j] + " ");
                        }
                        System.out.println();
                    }
        while (true) {
                    System.out.println();
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter n:");
                    int n = scanner.nextInt();
                    if (n < 1 || n > 9) {
                        System.out.println("You must enter between 1 and 9");
                        return;
                    }
                    System.out.println(" in Which row you want to put number ");
                    System.out.print(" enter this row:");
                    int i = scanner.nextInt();
                    if (i < 0 || i > 8) {
                        System.out.println("This row not exist!");
                        return;
                    }

                    System.out.println(" in Which collumn you want to put number ");
                    System.out.print(" enter this collumn :");
                    int j = scanner.nextInt();
                    if (j < 0 || j > 8) {
                        System.out.println("This coolumn not exist!");
                        return;
                    }
                    System.out.println();

                    if (sudoku[i][j] != 0) {
                        System.out.println(" This cell is busy!");
                        return;
                    }/*else {
            for (int i1 = 0; i1 < 9; i1++) {
                for (int i2 = 0; i2 < 9; i2++) {
                    if(sudoku[i][i2]==n)
                    {
                        System.out.println(" you don't put n in this row");
                    } else if (sudoku[i1][j]==n) {
                        System.out.println(" you don't put n in this column");
                    }else {
                        sudoku[i][j]=n;
                    }
                }
            }
        }*/
                    if (sudoku[i][0] == n || sudoku[i][1] == n || sudoku[i][2] == n || sudoku[i][3] == n ||
                            sudoku[i][4] == n || sudoku[i][5] == n || sudoku[i][6] == n || sudoku[i][7] == n || sudoku[i][8] == n) {
                        System.out.println("you don't put this row ");
                        continue;
                    }
                    if (sudoku[0][j] == n || sudoku[1][j] == n || sudoku[2][j] == n ||
                            sudoku[3][j] == n || sudoku[4][j] == n || sudoku[5][j] == n || sudoku[6][j] == n || sudoku[7][j] == n || sudoku[8][j] == n) {
                        System.out.println(" you don't put this column");
                        continue;
                    }
                    if ((i == 0 && j == 0) && (sudoku[1][1] == n || sudoku[2][1] == n || sudoku[2][2] == n || sudoku[1][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 0 && j == 1) && (sudoku[1][0] == n || sudoku[2][0] == n || sudoku[2][1] == n || sudoku[2][2] == n)) {

                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 0 && j == 2) && (sudoku[1][0] == n || sudoku[2][0] == n || sudoku[1][1] == n || sudoku[2][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 0) && (sudoku[1][1] == n || sudoku[2][1] == n || sudoku[2][2] == n || sudoku[1][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 1) && (sudoku[0][0] == n || sudoku[2][0] == n || sudoku[2][2] == n || sudoku[0][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 2) && (sudoku[0][0] == n || sudoku[0][1] == n || sudoku[2][0] == n || sudoku[2][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 0) && (sudoku[0][1] == n || sudoku[0][2] == n || sudoku[1][1] == n || sudoku[1][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 1) && (sudoku[0][0] == n || sudoku[1][0] == n || sudoku[0][2] == n || sudoku[1][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 2) && (sudoku[0][0] == n || sudoku[0][1] == n || sudoku[1][0] == n || sudoku[1][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 0 && j == 3) && (sudoku[1][4] == n || sudoku[1][5] == n || sudoku[2][4] == n || sudoku[2][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 0 && j == 4) && (sudoku[1][3] == n || sudoku[2][3] == n || sudoku[1][5] == n || sudoku[2][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 0 && j == 5) && (sudoku[1][3] == n || sudoku[2][3] == n || sudoku[1][4] == n || sudoku[2][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 3) && (sudoku[1][4] == n || sudoku[2][4] == n || sudoku[1][5] == n || sudoku[2][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 4) && (sudoku[0][3] == n || sudoku[2][3] == n || sudoku[0][5] == n || sudoku[2][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 5) && (sudoku[0][3] == n || sudoku[0][4] == n || sudoku[2][3] == n || sudoku[2][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 3) && (sudoku[0][4] == n || sudoku[0][5] == n || sudoku[1][4] == n || sudoku[1][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 4) && (sudoku[0][3] == n || sudoku[1][3] == n || sudoku[0][5] == n || sudoku[1][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 5) && (sudoku[0][3] == n || sudoku[0][4] == n || sudoku[1][3] == n || sudoku[1][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 0 && j == 6) && (sudoku[0][7] == n || sudoku[1][7] == n || sudoku[0][8] == n || sudoku[1][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 0 && j == 7) && (sudoku[0][6] == n || sudoku[1][6] == n || sudoku[0][8] == n || sudoku[1][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 0 && j == 8) && (sudoku[1][6] == n || sudoku[1][7] == n || sudoku[2][6] == n || sudoku[2][7] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 6) && (sudoku[0][7] == n || sudoku[0][8] == n || sudoku[2][7] == n || sudoku[2][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 7) && (sudoku[0][6] == n || sudoku[0][8] == n || sudoku[2][6] == n || sudoku[2][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 1 && j == 8) && (sudoku[0][6] == n || sudoku[0][7] == n || sudoku[1][6] == n || sudoku[1][7] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 6) && (sudoku[0][7] == n || sudoku[0][8] == n || sudoku[1][7] == n || sudoku[1][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 7) && (sudoku[0][6] == n || sudoku[1][6] == n || sudoku[0][8] == n || sudoku[1][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 2 && j == 8) && (sudoku[0][6] == n || sudoku[0][7] == n || sudoku[1][6] == n || sudoku[1][7] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 0) && (sudoku[4][1] == n || sudoku[4][2] == n || sudoku[5][1] == n || sudoku[5][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 1) && (sudoku[4][0] == n || sudoku[5][0] == n || sudoku[4][2] == n || sudoku[5][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 2) && (sudoku[5][0] == n || sudoku[4][0] == n || sudoku[4][1] == n || sudoku[5][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 0) && (sudoku[3][1] == n || sudoku[3][2] == n || sudoku[5][1] == n || sudoku[5][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 1) && (sudoku[3][0] == n || sudoku[5][0] == n || sudoku[3][2] == n || sudoku[5][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 2) && (sudoku[3][0] == n || sudoku[5][0] == n || sudoku[3][1] == n || sudoku[5][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 0) && (sudoku[3][1] == n || sudoku[3][2] == n || sudoku[4][1] == n || sudoku[4][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 1) && (sudoku[3][0] == n || sudoku[4][0] == n || sudoku[3][2] == n || sudoku[4][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 2) && (sudoku[3][0] == n || sudoku[4][0] == n || sudoku[3][1] == n || sudoku[4][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 3) && (sudoku[4][5] == n || sudoku[5][4] == n || sudoku[4][4] == n || sudoku[5][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 4) && (sudoku[4][3] == n || sudoku[5][3] == n || sudoku[5][5] == n || sudoku[4][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 5) && (sudoku[4][3] == n || sudoku[5][3] == n || sudoku[4][4] == n || sudoku[5][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 3) && (sudoku[3][4] == n || sudoku[3][5] == n || sudoku[5][4] == n || sudoku[5][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 4) && (sudoku[3][3] == n || sudoku[5][5] == n || sudoku[5][3] == n || sudoku[3][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 5) && (sudoku[4][4] == n || sudoku[4][3] == n || sudoku[5][3] == n || sudoku[5][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 3) && (sudoku[3][4] == n || sudoku[3][5] == n || sudoku[4][4] == n || sudoku[4][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 4) && (sudoku[3][3] == n || sudoku[4][3] == n || sudoku[3][5] == n || sudoku[4][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 5) && (sudoku[3][3] == n || sudoku[4][3] == n || sudoku[4][4] == n || sudoku[3][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 6) && (sudoku[4][7] == n || sudoku[4][8] == n || sudoku[5][7] == n || sudoku[5][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 7) && (sudoku[3][6] == n || sudoku[3][8] == n || sudoku[5][6] == n || sudoku[5][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 3 && j == 8) && (sudoku[4][6] == n || sudoku[4][7] == n || sudoku[5][6] == n || sudoku[5][7] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 6) && (sudoku[3][7] == n || sudoku[3][8] == n || sudoku[5][7] == n || sudoku[5][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 7) && (sudoku[3][6] == n || sudoku[3][8] == n || sudoku[5][6] == n || sudoku[5][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 4 && j == 8) && (sudoku[3][6] == n || sudoku[3][7] == n || sudoku[5][6] == n || sudoku[5][7] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 6) && (sudoku[3][7] == n || sudoku[3][8] == n || sudoku[4][7] == n || sudoku[4][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 7) && (sudoku[3][6] == n || sudoku[4][6] == n || sudoku[3][8] == n || sudoku[4][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 5 && j == 8) && (sudoku[3][6] == n || sudoku[3][7] == n || sudoku[4][6] == n || sudoku[4][7] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 0) && (sudoku[7][1] == n || sudoku[7][2] == n || sudoku[8][1] == n || sudoku[8][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 1) && (sudoku[7][0] == n || sudoku[8][0] == n || sudoku[7][2] == n || sudoku[8][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 2) && (sudoku[7][0] == n || sudoku[8][0] == n || sudoku[7][1] == n || sudoku[8][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 0) && (sudoku[6][1] == n || sudoku[6][2] == n || sudoku[8][1] == n || sudoku[8][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 1) && (sudoku[6][0] == n || sudoku[8][0] == n || sudoku[6][2] == n || sudoku[8][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 2) && (sudoku[6][0] == n || sudoku[8][0] == n || sudoku[6][1] == n || sudoku[8][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 0) && (sudoku[7][1] == n || sudoku[7][2] == n || sudoku[8][1] == n || sudoku[8][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 1) && (sudoku[6][0] == n || sudoku[7][0] == n || sudoku[6][2] == n || sudoku[7][2] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 2) && (sudoku[6][0] == n || sudoku[7][0] == n || sudoku[6][1] == n || sudoku[7][1] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 3) && (sudoku[7][4] == n || sudoku[7][5] == n || sudoku[8][4] == n || sudoku[8][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 4) && (sudoku[7][3] == n || sudoku[7][5] == n || sudoku[8][3] == n || sudoku[8][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 5) && (sudoku[7][3] == n || sudoku[7][4] == n || sudoku[8][3] == n || sudoku[8][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 3) && (sudoku[6][4] == n || sudoku[6][5] == n || sudoku[8][4] == n || sudoku[8][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 4) && (sudoku[6][3] == n || sudoku[6][5] == n || sudoku[8][3] == n || sudoku[8][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 5) && (sudoku[6][3] == n || sudoku[6][4] == n || sudoku[8][3] == n || sudoku[8][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 3) && (sudoku[6][4] == n || sudoku[6][5] == n || sudoku[7][4] == n || sudoku[7][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 4) && (sudoku[6][3] == n || sudoku[6][5] == n || sudoku[7][3] == n || sudoku[7][5] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 5) && (sudoku[6][3] == n || sudoku[6][4] == n || sudoku[7][3] == n || sudoku[7][4] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 6) && (sudoku[7][7] == n || sudoku[7][8] == n || sudoku[8][7] == n || sudoku[8][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 7) && (sudoku[6][6] == n || sudoku[6][8] == n || sudoku[8][6] == n || sudoku[8][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 6 && j == 8) && (sudoku[7][6] == n || sudoku[7][7] == n || sudoku[8][6] == n || sudoku[8][7] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 6) && (sudoku[6][7] == n || sudoku[6][8] == n || sudoku[8][7] == n || sudoku[8][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 7) && (sudoku[6][6] == n || sudoku[8][8] == n || sudoku[8][6] == n || sudoku[6][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 7 && j == 8) && (sudoku[6][6] == n || sudoku[6][7] == n || sudoku[8][6] == n || sudoku[8][7] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 6) && (sudoku[6][7] == n || sudoku[6][8] == n || sudoku[7][7] == n || sudoku[7][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 7) && (sudoku[6][6] == n || sudoku[6][8] == n || sudoku[7][6] == n || sudoku[7][8] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }
                    if ((i == 8 && j == 8) && (sudoku[6][6] == n || sudoku[7][7] == n || sudoku[6][7] == n || sudoku[7][6] == n)) {
                        System.out.println("you don't put n this cell because in this block n is exist!");
                        continue;
                    }


                    sudoku[i][j] = n;
                    System.out.println();
                    for (int k = 0; k < 9; k++) {
                        for (int l = 0; l < 9; l++) {
                            System.out.print(sudoku[k][l] + " ");
                        }
                        System.out.println();
                    }
                }

    }
}
