package ch_01_arrays;

import java.util.Scanner;

import ch_0_utils.JavaUtils;

public class ReversePartOfArray {
    public static void reversePartArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = JavaUtils.makeArrayFromInput();
        JavaUtils.printArrays(arr);
        Scanner oScanner = new Scanner(System.in);
        int start = oScanner.nextInt();
        int end = oScanner.nextInt();
        reversePartArray(arr, start, end);
        JavaUtils.printArrays(arr);
    }
}
