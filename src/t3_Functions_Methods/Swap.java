package t3_Functions_Methods;

import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        System.out.println("hello");
        int a = 10;
        int b = 20;
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a+","+b);

        String name = "Vinay Joshi";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String naam) {
        naam = "Akshay Huria";  // creating a new object
    }
    //  Passed by the copy of the value of the reference variable
    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }
}
