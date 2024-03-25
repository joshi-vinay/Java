package t5_LinearSearch;
/*
Question Link:-
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 */
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.print(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        while(num>0){
            num /= 10;
            count++;
        }
        return count;
    }
}