package t5_LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 4, 56, -54, 65, -23, 19, 43, 0, 12, -185};
        System.out.println("Given Array: "+Arrays.toString(nums));
        int target = -23;
        System.out.println("Target Element = "+target);
//        System.out.println("The index of the target element is: "+linearSearch(nums,target));
//        int ans = linearSearch(nums,target);
        int ans = linearSearch2(nums,target);
//        boolean ans = linearSearch3(nums,target);
        System.out.println(ans);
    }
    /*
    search in the array: return the index if irm found otherwise if item not found return -1.
     */
//    static int linearSearch(int[] arr, int target){
//        if(arr.length == 0){
//            System.out.print("Element not found: ");
//            return -1;
//        }
//        //  run a for loop:
//        for(int index = 0; index<arr.length; index++){
//            int element = arr[index];
//            if(element == target){
//                return index;
//            }
//        }
//        /*  this line will execute if none of the return statements above have executed
//          Hence the target not found. */
//        return -2;
//    }

    //  return the element if target found:-
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            System.out.print("Element not found: ");
            return -1;
        }
        //  run a for loop:
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        /*  this line will execute if none of the return statements above have executed
          Hence the target not found. */
        return Integer.MAX_VALUE;
    }

    //  return true if element found else return false:
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            System.out.print("Element not found: ");
            return false;
        }
        //  run a for loop:
        for (int element : arr) {   //  enhanced for loop
            if (element == target) {
                return true;
            }
        }
        /*  this line will execute if none of the return statements above have executed
          Hence the target not found. */
        return false;
    }
}
