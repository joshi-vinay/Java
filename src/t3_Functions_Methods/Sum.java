package t3_Functions_Methods;

import java.util.Scanner;

public class Sum {

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter value of num1 : ");
        num1 = in.nextInt();
        System.out.print("Enter value of num2 : ");
        num2 = in.nextInt();
        sum = num1 + num2;
//        System.out.print("The sum of "+num1+" and "+num2+" is : "+sum);
        return  sum;
    }
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        int num1, num2, sum;
//        System.out.print("Enter value of num1 : ");
//        num1 = in.nextInt();
//        System.out.print("Enter value of num2 : ");
//        num2 = in.nextInt();
//        sum = num1 + num2;
//        System.out.print("The sum of "+num1+" and "+num2+" is : "+sum);
//    }
    public static void main(String[] args) {
//        sum();
//        System.out.println("\n");
//        sum();
//        int ans = sum2();
        int ans = sum3(20,50);
        System.out.println("Answer is : "+ans);


    }
}


