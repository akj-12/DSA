package ch_01_arrays;

import java.util.Scanner;

import ch_0_utils.JavaUtils;

public class SwapIndex {
    public static void swapArrayindexes(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = JavaUtils.makeArrayFromInput();
        JavaUtils.printArrays(arr);
        Scanner scanner = new Scanner(System.in);
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        swapArrayindexes(arr, index1,index2);
        JavaUtils.printArrays(arr);
    }
}
