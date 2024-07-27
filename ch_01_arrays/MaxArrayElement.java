package ch_01_arrays;

import ch_0_utils.JavaUtils;

public class MaxArrayElement {
    public static int getMaxElement(int[] arr) {
        int maxSofar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSofar) {
                maxSofar = arr[i];
            }
        }
        return maxSofar;
    }

    public static void main(String[] args) {
        int[] arr = JavaUtils.makeArrayFromInput();
        System.out.println(getMaxElement(arr));
    }
}
