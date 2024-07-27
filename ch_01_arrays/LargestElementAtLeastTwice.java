package ch_01_arrays;

import ch_0_utils.JavaUtils;

public class LargestElementAtLeastTwice {
    public static int getlargest(int[] arr) {
        int maxSofar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxSofar]) {
                maxSofar = i;
            }
        }
        return maxSofar;
    }

    public static int getlargestElementAtLeastTwice(int[] arr) {
        int largetsElement = getlargest(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] * 2 > arr[largetsElement] && arr[i] != arr[largetsElement]) {
                return -1;
            }
        }
        return largetsElement;
    }

    public static void main(String[] args) {
        int[] arr = JavaUtils.makeArrayFromInput();
        int getMaxTwice = getlargestElementAtLeastTwice(arr);
        System.out.println(getMaxTwice);
    }
}
