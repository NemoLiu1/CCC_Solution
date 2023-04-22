package ccc2016;

import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        int[][] square = new int[4][4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                square[i][j] = in.nextInt();
            }
        }
        //in arrays "sum", num 0 to 3 represent the sum of rows,
        // and 4 to 7 is the sum of columns.
        int [] sum = new int [8];
        //int [] col = new int [4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i] += square[i][j];
                sum[j+4] += square[i][j];
            }
        }
        int i = 1;
        for (; i < 8; i++) {
            if (sum[0] != sum[i]) {
                System.out.println("not magic");
                break;
            }

        }
        if (i == 8) {
            System.out.println("magic");
        }
    }
}

//arrays