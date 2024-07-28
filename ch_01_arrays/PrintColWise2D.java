package ch_01_arrays;

import java.util.Scanner;

public class PrintColWise2D {
    public static void main(String[] args) {
        Scanner oScanner = new Scanner(System.in);
        int row = oScanner.nextInt();
        int col = oScanner.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = oScanner.nextInt();
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
