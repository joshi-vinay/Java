package t3_Functions_Methods.Assignment;

import java.util.Scanner;

public class Q8 {
        /*  Write a program to print the factorial of a number by defining a method named 'Factorial'.
         Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
            4! = 1 * 2 * 3 * 4 = 24
            3! = 3 * 2 * 1 = 6
            2! = 2 * 1 = 2
            Also,
            1! = 1
            0! = 1
         */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int fact = Factorial(num);
        System.out.println("The factorial of "+num+" is: "+fact);

    }
    static int Factorial(int n){
        int fact = 1;
        while(n>0){
            fact = fact*n;
            n--;
        }
            return fact;

    }
}
