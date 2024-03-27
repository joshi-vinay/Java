package t4_Arrays;

/*
Lucky Numbers in a Matrix:-
Question Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/1215113150
 */

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] arr = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };

        // Create an instance of the LuckyNumber class
        LuckyNumber luckyNumber = new LuckyNumber();

        // Call the luckyNumbers method and store the result
        List<Integer> luckyNums = luckyNumber.luckyNumbers(arr);

        // Print the lucky numbers
        System.out.print("Lucky Numbers: ");
        for (int num : luckyNums) {
            System.out.println(num);
        }

    }
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>(matrix.length);
        //  Find minimum element in each row & store them in an array:
        int[] minRow = new int[matrix.length];
        for(int i = 0; i<matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            minRow[i] = min;
        }

        //  Find maximum element in each column & store them in an array:
        int[] maxCol = new int[matrix[0].length];
        for(int j = 0; j<matrix[0].length; j++){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<matrix.length; i++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            maxCol[j] = max;
        }

        //  Check if there are any common elements in minRow & maxCol if so add them in the list(result)

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]){
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
