package ch_01_arrays;

import ch_0_utils.JavaUtils;

public class ReverseArray {

    public static void reverseArray(int[] array) {
        int start = 0, end = array.length - 1;
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
        reverseArray(arr);
        JavaUtils.printArrays(arr);
    }
}
