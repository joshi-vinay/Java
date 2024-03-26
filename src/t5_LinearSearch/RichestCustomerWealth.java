package t5_LinearSearch;

/*
Question Link:-
https://leetcode.com/problems/richest-customer-wealth/submissions/1214291655
 */

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},    // 6
                {2,4,5},    // 11
                {4,1,7}     // 12
        };
        System.out.println(maximumWealth(arr));
    }
//    static int maximumWealth(int[][] accounts) {
//        int maxWealth = Integer.MIN_VALUE;
//        for(int i = 0; i<accounts.length; i++){
//        int rowSum = 0;
//            for(int j = 0; j<accounts[i].length; j++){
//                rowSum += accounts[i][j];
//            }
//            if(rowSum > maxWealth){
//                maxWealth = rowSum;
//            }
//        }
//        return maxWealth;
//    }
static int maximumWealth(int[][] accounts) {
    int maxWealth = Integer.MIN_VALUE;
    for (int[] account : accounts) {
        int rowSum = 0;
        for (int i : account) {
            rowSum += i;
        }
        if (rowSum > maxWealth) {
            maxWealth = rowSum;
        }
    }
    return maxWealth;
}
}
