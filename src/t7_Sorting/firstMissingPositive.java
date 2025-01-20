package t7_Sorting;

import java.util.Arrays;

import static t7_Sorting.cyclicSort.swap;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        missingPositive(nums);
        System.out.println("The sorted array is: " + Arrays.toString(nums));
        System.out.println("The first missing positive integer is: " + missingPositive(nums));
    }
    static int missingPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }
}
