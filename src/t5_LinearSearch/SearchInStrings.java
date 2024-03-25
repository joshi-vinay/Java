package t5_LinearSearch;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.next();
        System.out.print("Enter the letter you want to search: ");
        char letter = in.next().charAt(0);
        Boolean ans = String(str,letter);
        System.out.println(ans);

    }
    static boolean String(String str, char target){
        if(str.isEmpty()){
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == target){
//                return true;
//            }

        //  using enhanced for loop:-

        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
