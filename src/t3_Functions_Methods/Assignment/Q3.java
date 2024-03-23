package t3_Functions_Methods.Assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*  A person is eligible to vote if his/her age is greater than or equal to 18.
          Define a method to find out if he/she is eligible to vote.    */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        Vote(age);
    }
    static void Vote(int age){
        if(age >= 18 && age <= 100){
            System.out.println("You are eligible to vote.");
        } else if (age > 100) {
            System.out.println("You are eligible, but you should stay at home.");
        } else System.out.println("You are not eligible to vote.");
    }
}
