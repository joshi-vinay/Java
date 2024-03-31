package t6_BinarySearch.Assignment;

/*
Question: You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
There are at least two different characters in letters. Return the smallest character in letters that is lexicographically
greater than target. If such a character does not exist, return the first character in letters.

Question Link:- https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1219139026
 */

public class lexicographically {
    public static void main(String[] args) {
//        char[] arr = {'x','x','y','y'};
//        char target = 'z';
        char[] arr = {'c','f','j'};
        char target = 'j';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);

    }
    static char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length-1]){
            return letters[0];
        }
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target >= letters[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return letters[start]; // because at this situation start will be equal to the size of the array.
        //  OR
//        return letters[start % letters.length];

    }
}
