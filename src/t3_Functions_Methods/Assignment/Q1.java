package t3_Functions_Methods.Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*  Define two methods to print the maximum and the minimum number respectively among
          three numbers entered by the user.    */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers:"+" ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a==b && b==c){
            System.out.println("All the three numbers are equal");
        }else{
        max(a,b,c);
        min(a,b,c);
        }

    }
    static void max(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max+" is maximum among the three.");
    }
    static void min(int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        System.out.println(min+" is minimum among the three.");
    }

}
