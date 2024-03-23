package t3_Functions_Methods.Assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //  Define a program to find out whether a given number is even or odd.
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a nuber: ");
        int num = in.nextInt();
        if(num == 0){
            System.out.println(num+" is neither even nor odd.");
        }else {
        EvenOrOdd(num);
        }
    }
    static void EvenOrOdd(int n){
        if(n%2==0){
            System.out.println(n+" is an even number.");
        }else System.out.println(n+" is an odd number.");

    }
}
