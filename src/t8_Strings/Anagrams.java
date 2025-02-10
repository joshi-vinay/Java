package t8_Strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(isAnagram(str1,str2));
    }
    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
}
