package t4_Arrays;

//  Richest Customer Wealth leetcode:
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
// ith customer has in the jth bank. Return the wealth that the richest customer has.

public class Richest {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        sum(arr);
        System.out.println(richest(arr));
    }
    static int richest(int[][] arr){
        int maxElement = arr[0][0];

        for(int i = 0; i<arr.length; i++){
        int rowsum = 0;
            for(int j = 0; j<arr[i].length; j++){
                rowsum += arr[i][j];
            }
                if(rowsum > maxElement){
                    maxElement=rowsum;
                }
//            System.out.println(rowsum);
        }
        return maxElement;
    }
}
