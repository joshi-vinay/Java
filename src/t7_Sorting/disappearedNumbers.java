package t7_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class disappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("The disappeared elements of the array are: " + Arrays.toString(new List[]{missing(nums)}));
    }
    static List<Integer> missing (int[] arr){
        List<Integer> ans = new ArrayList<>();
   for(int i = 0; i< arr.length; i++){
       if(arr[i] != i + 1){
           ans.add(i + 1);
       }
   }
    return ans;
    }

    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int index = arr[i] - 1;
            if(arr[i] != arr[index]){
                swap(arr, i, index);
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