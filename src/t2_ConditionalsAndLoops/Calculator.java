package t2_ConditionalsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator Program :)");
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op=='+' || op=='-' || op == '*' || op=='/' || op == '%'){
                System.out.print("Enter num1: ");
                int num1 = in.nextInt();
                System.out.print("Enter num2: ");
                int num2 = in.nextInt();
                if(op=='+') {
                    ans = num1 + num2;
                }
                if(op=='-') {
                    ans = num1 - num2;
                }
                if(op=='*') {
                    ans = num1 * num2;
                }
                if(op=='/') {
                    ans = num1 / num2;
                }
                if(op=='%'){
                    ans = num1%num2;
                }
            }
                else if(op=='x' || op=='X'){
                    break;
                }else{
                    System.out.println("Invalid operation!!");
                }
                System.out.println("The result is: " +ans);
        }
    }
}


