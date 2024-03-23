package t3_Functions_Methods.Assignment;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //  Define a method to find out if a number is prime or not.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        Prime(num);
    }
    static void Prime(int n){
        if(n<=1){
            System.out.println(n+" is not a prime number.");
            return;
        }
        int x = 2;
        while(x*x <= n){
        if(n%x==0){
            System.out.println(n+" is not a prime number.");
            return;
        }
            x++;
        }
        if(x*x>n){
            System.out.println(n+" is a prime umber.");
        }
        else System.out.println(n+ " is not a prime number.");
    }
}
