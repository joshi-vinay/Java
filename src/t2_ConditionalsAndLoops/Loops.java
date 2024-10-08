package t2_ConditionalsAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax of for loop:
        for(initialisation; condition; increment/decrement){
            //body
        }

         */
        //  Q. Print numbers from 1 to 5

//        for (int num = 1; num <= 5; num += 2){
//            System.out.println(num);
//        }
        //  Print numbers from 1 to n
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        for(int n = 1; n <= num; n += 1){
//            System.out.print(n + " ");
//        }

        /*
        Syntax for while loop-->
            while(condition){
                //body
                increment/decrement
            }

         */
        Scanner input = new Scanner(System.in);
//        System.out.println();
//        int num = 1;
//        while(num<=5){
//            System.out.print(num + " ");
//            num++;
//        }

        /*
        Syntax for do while loop-->\
        do{
            //body
        }while(condition);
         */
        int num = 1;
        do {
            System.out.println(num);
            num++;
        }while (num<=5);
        /*
        The difference between while and do while loop is that do while loop will always
        execute at least once and after that it will execute according to the condition
        given in while loop.
         */
    }
}
