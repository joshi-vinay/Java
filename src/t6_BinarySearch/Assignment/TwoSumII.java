package t6_BinarySearch.Assignment;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums, int target) {
//
        int left = 0;
        int right = nums.length-1;

        // Iterate through the array using two pointers
        while (left < right) {
            int sum = nums[left] + nums[right];

            // If sum is equal to target, return the indices
            if (sum == target) {
                return new int[] { left+1, right+1 };
            }
            // If sum is less than target, increment left pointer
            else if (sum < target) {
                left++;
            }
            // If sum is greater than target, decrement right pointer
            else {
                right--;
            }
        }

        // If no solution found, return null
        return null;
    }
}
