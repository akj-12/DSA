package ch_01_arrays;
import ch_0_utils.JavaUtils;

/**
 * SumOfElement
 */
public class SumOfElement {

    public static int getSumOfElement(int[] arr){
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = JavaUtils.makeArrayFromInput();
        JavaUtils.printArrays(arr);
        System.out.println(getSumOfElement(arr));
    }
}