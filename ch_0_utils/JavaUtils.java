package ch_0_utils;

import java.util.Scanner;

public class JavaUtils {

    public static int[] makeArrayFromInput() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void printArrays(int[] array) {
        System.out.print(" [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ] ");
    }
}
