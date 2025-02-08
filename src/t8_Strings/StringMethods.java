package t8_Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "  Vinay Joshi  ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); //  creating a new object not changing the original one.
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
//        System.out.println(name.trim());
        System.out.println(name.strip());
        //  The strip() method is a string method that returns a new string with leading and trailing whitespace removed.
        System.out.println(Arrays.toString(name.split(" ")));   //  split() returns a String[] (Array of String).
        //  The split() method splits a string into an array of substrings based on a delimiter (in this case, a space " ").
    }
}
