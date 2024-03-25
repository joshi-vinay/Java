package t5_LinearSearch;

import java.util.Arrays;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println("The minimum element in the given array is: " + Minimum(arr));
    }
    static int Minimum(int[] arr){
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
