package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 31, 2, 4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxElement(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxElement(int[] arr, int start, int end) {
        int max = arr[start]; // Initialize max with the first element
        int maxIndex = start; // Initialize maxIndex with the start

        for (int i = start + 1; i <= end; i++) { // Change i = start + 1 and use <= end
            if (arr[i] > max) { // Compare with arr[i], not i
                max = arr[i];
                maxIndex = i; // Update maxIndex
            }
        }

        return maxIndex; // Return the index of the maximum element
    }
}

