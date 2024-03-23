package t3_Functions_Methods.Assignment;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        //  Write a function that returns the sum of first n natural numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int ans =Natural(n);
        System.out.print("The sum of first "+n+" natural numbers is: "+ans);
    }
    static int Natural(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }
}
