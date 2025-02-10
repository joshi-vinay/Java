package t8_Strings;

//  Problem --> Count how may times lowercase vowels occurred in a String entered by the user.

import java.util.Scanner;

public class VowelsOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.println("There are " + LowerCaseVowels(str) + " occurrences of lowercase vowels in this string.");
    }
    static int LowerCaseVowels(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}
