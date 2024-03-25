package t5_LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 56;
//        int[] ans = Search(nums,target);
//        System.out.print("The index of "+target+" is: "+ Arrays.toString(ans));
        int ans2 = Max(nums);
        System.out.println("The maximum element in the array is: "+ ans2);
//        System.out.println(Integer.MIN_VALUE);  //  -2147483648
    }
    //  method return type is itself an array which will contain the row and column of the target element.
//    static int[] Search(int[][] arr, int target){
//        for(int row = 0; row<arr.length; row++){
//            for(int col = 0; col<arr[row].length; col++){
//                if(arr[row][col] == target){
//                   return new int[]{row, col};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

    //  finding maximum element in a 2D Array:-
    static int Max(int[][] arr){
//        int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
