package t7_Sorting;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("the missing number in the array is: " + missing(nums));
    }
    static int missing(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }
        //  here, if every element is at its correct position --> which means the missing element is n which is the size of the array, therefore:
        return arr.length;
    }
    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int value = arr[i];
            if(arr[i] < arr.length && i != value){
                swap(arr, i , value);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
