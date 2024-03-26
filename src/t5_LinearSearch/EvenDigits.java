package t5_LinearSearch;
/*
Question Link:-
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 */
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,-7896};
        System.out.print(findNumbers(nums));
//        System.out.println(digits(0)); // to count the no of digits in a number.
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
    //  function to check whether a number contains even number of digits or not:-
    static boolean even(int num){
        int numberOfDigits = digits2(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    //  count number of digits in a number:-
//    static int digits(int num) {
//        if(num<0){
////            num = num*-1;
//            num *= -1;
//        }
//        if(num == 0){
//            return 1;
//        }
//        int count = 0;
//        while(num>0){
//            num /= 10;
//            count++;
//        }
//        return count;
//    }
    static int digits2(int num){
        if(num<0){
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}