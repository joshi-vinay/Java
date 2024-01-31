package t2_ConditionalsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        //  to print fibonacci series to nth place -->
//        System.out.print(a + " " + b + " ");
//        while (count <= n) {
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//            System.out.print(b + " ");
//        }

        //  to print nth fibonacci number -->

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.print(b);

    }
}

