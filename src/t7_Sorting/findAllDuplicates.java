package t7_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static t7_Sorting.cyclicSort.swap;

public class findAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        duplicates(nums);
        System.out.println("The sorted array is: " + Arrays.toString(nums));
        System.out.println("The duplicate elements are: " + duplicates(nums));

    }
    static List<Integer> duplicates(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        //  first apply cyclic sort :
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int idx = 0; idx < nums.length; idx++){
            if(nums[idx] != idx + 1){
                ans.add(nums[idx]);
            }
        }
        return ans;
    }

}
