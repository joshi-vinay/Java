package t3_Functions_Methods.Assignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //  Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int ans = Sum(num1,num2);
        System.out.print("The sum of "+num1+" and "+num2+" is "+ans);
    }
    static int Sum(int a, int b){
        return a+b;
    }
}
