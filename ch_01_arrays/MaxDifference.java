package ch_01_arrays;

import ch_0_utils.JavaUtils;

public class MaxDifference {
    public static int getMaxDifference(int[] arr) {
        int maxDiffSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] - arr[j] > maxDiffSoFar) {
                    maxDiffSoFar = arr[i] - arr[j];
                }
            }
        }
        return maxDiffSoFar;
    }

    public static int maxdifference_1(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = JavaUtils.makeArrayFromInput();
        System.out.println(getMaxDifference(arr));
        System.out.println(maxdifference_1(arr));
    }
}
