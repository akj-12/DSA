package ch_01_arrays;

public class CountGreater {
    public static int countAtleastGreaterThanitself(int[] arr) {
        int largest = MaxArrayElement.getMaxElement(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest) {
                count++;
            }
        }
        return arr.length - count;
    }

    public static void main(String[] args) {
        int[] arr = { -4, -3, 7, 9, 3, 9, 4 };
        System.out.println(countAtleastGreaterThanitself(arr));
    }
}
