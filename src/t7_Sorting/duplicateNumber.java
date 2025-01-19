package t7_Sorting;

import java.util.Arrays;

public class duplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
//        int[] nums = {4, 2, 1, 1, 3, 5};
        duplicate(nums);
        System.out.println("Sorted array is: " + Arrays.toString(nums));
        System.out.println("The duplicate element is: " + duplicate(nums));
    }

    static int duplicate(int[] arr){
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {  //  Check if the current number is in the correct position
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {   //  Swap only if the current number is not at its correct position
                    swap(arr, i , correct);
                } else {
                    //  If nums[i] == nums[correctIndex], we've found the duplicate
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
