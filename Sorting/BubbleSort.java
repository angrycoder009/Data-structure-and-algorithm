package Sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,1,5,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int []arr){
        //for check for it need to swapped or not
        boolean swapped ;
        //run for n-1 times
        for(int i = 0 ; i < arr.length ; i++){
           swapped = false ;
           //for each step , max item will come at the last respective index.
           for(int j = 1 ; j< arr.length - i; j++){
            //swap if item is smaller than previous items
            if(arr[j]<arr[j-1]){
                //swap
                int tem = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tem;
                swapped = true;
                }
            }
            if(!swapped){
                // if you did not swap for a particular value of i , it means the array is
                //sorted hence stop the program
            break;
           }
        }
    }
}
