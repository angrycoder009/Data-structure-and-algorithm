package Sorting;
import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Fix: Add 1, not subtract
            // Comparison between current and corrected index
            if (arr[i] != arr[correctIndex]) { // Fix: Change 'correctIndex' to 'arr[correctIndex]'
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
