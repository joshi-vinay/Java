package t2_ConditionalsAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //  Q. Find the largest of the 3 numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = in.nextInt();

        //  Method 1
//        if(num1 > num2 && num1 > num3){
//            System.out.println(num1 + " is greater than " + num2 + " and " + num3 );
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println(num2 + " is greater than " + num3 + " and " + num1);
//        }
//        else{
//            System.out.println(num3 + " is greater than " + num1 + " and " + num2);
//        }

        //  Method 2
//        int max = num1;
//        if(num2 > max){
//            max = num2;
//        }
//        if(num3 > max){
//            max = num3;
//        }
//        System.out.println(max + " is the greatest among the three");

        //  Method 3
        int max = Math.max(num3,Math.max(num1,num2)) ;
        System.out.println(max + " is maximum.");

    }
}
