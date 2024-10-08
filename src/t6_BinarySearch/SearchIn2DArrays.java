package t6_BinarySearch;

import java.util.Arrays;

public class BinarySearch2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {18, 9, 12},
                {36, -4, 91},
                {44, 33, 16}
        };
        int target = 91;
        int[] ans = binarySearch2D(arr,target);
        System.out.println("The target element found at position:" + Arrays.toString(ans));
    }
        static int[] binarySearch2D(int[][] arr,  int target){
            for(int row = 0; row<arr.length; row++){
                for(int col = 0; col<arr[row].length; col++){
                    if(arr[row][col] == target){
                        return new int[]{row,col};
                    }
                }
            }
            return new int[]{-1};
        }
}