package t3_Functions_Methods.Assignment;

import java.util.Scanner;

        /*  Write a program that will ask the user to enter his/her marks (out of 100). Define a
        method that will display grades according to the marks entered as below:
         Marks        Grade
        91-100         A
        81-90          B
        71-80          C
        61-70          D
        51-60          E
        41-50          R
        <=40          Fail          */
public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = in.nextInt();
        Grade(marks);

    }
    static void Grade(int m){
        if(m >= 91 && m<=100){
            System.out.println("Your grade is: A");
        } else if (m >= 81 && m<= 90) {
            System.out.println("Your grade is: B");
        }else if (m >= 71 && m<= 80) {
            System.out.println("Your grade is: C");
        }else if (m >= 61 && m<= 70) {
            System.out.println("Your grade is: D");
        }else if (m >= 51 && m<= 60) {
            System.out.println("Your grade is: E");
        }else if (m >= 41 && m<= 50) {
            System.out.println("Your grade is: R");
        } else if (m <= 40) {
            System.out.println("You are fail.");
        }
        else{
            System.out.println("Please enter correct marks.");
        }
    }

}
