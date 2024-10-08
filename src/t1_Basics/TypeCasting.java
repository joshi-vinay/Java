package t1_Basics;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //Type Casting: Compressing a bigger number in a smaller type explicitly.
//        int num = (int)(67.86f);
//        System.out.println(num);

        //Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); //257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;    //Automatic type promotion in expressions, converted to biggest ones.
//        System.out.println(d);

//        int number = 'A';
//        System.out.println(number);

        byte b = 40;
        char c = 'v';
        short s = 1024;
        int i = 7000;
        float f = 78.679f;
        double d = 3.676578587;
        double result = (f * s) + (i - c) -(b * d);
//        float + int - double = double
        System.out.println((f * s) + " " + (i - c) + " " + (b * d));
        System.out.println(result);


    }
}
