package t7_Sorting;

import java.util.Arrays;

import static t7_Sorting.cyclicSort.swap;

public class setMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println("The repeated and missing element is: "+Arrays.toString(findErrorNums(nums)));

    }
    static int[] findErrorNums(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                return new int[]{arr[j], j+1};
            }
        }
            return new int[]{-1,-1};
    }
}
