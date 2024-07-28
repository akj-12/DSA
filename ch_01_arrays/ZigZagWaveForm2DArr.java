package ch_01_arrays;

import java.util.Scanner;

public class ZigZagWaveForm2DArr {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner oScanner = new Scanner(System.in);
        int row = oScanner.nextInt();
        int col = oScanner.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = oScanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
