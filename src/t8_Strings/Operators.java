package t8_Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  //  O/p --> 195
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 3); // 100
        System.out.println((char) ('a' + 3)); // d

        System.out.println("a" + 1); // a1
        // this is same as after a few steps "a" + "1"
        // integer will be converted into Integer that will call toString().

        System.out.println("Kunal" + new ArrayList<>());
//        System.out.println(new Integer(56) + new ArrayList<>());  //  this will give error cuz at least one object should be of string type.

        System.out.println(new Integer(56) + "" + new ArrayList<>());   // Output = 56[]


    }
}
