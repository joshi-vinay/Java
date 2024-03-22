package t3_Functions_Methods;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        int ans = Armstrong(n);
//        System.out.println(ans);

        if(ans == n){
            System.out.println(n+" is an Armstrong number.");
        }
        else{
            System.out.println(n+" is not an Armstrong number.");

        }
    }

    private static int Armstrong(int n) {
        int sum = 0;
        while(n>0){
            int rem = n%10;
            int cube = rem*rem*rem;
            sum += cube;
            n = n/10;
        }
        return sum;

    }


}

//  Print all the 3 digit Armstrong numbers.

//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    for (int i = 100; i < 1000; i++) {
//        if (isArmstrong(i)) {
//            System.out.print(i + " ");
//        }
//    }
//
//    static boolean isArmstrong(int n) {
//        int original = n;
//        int sum = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            n = n / 10;
//            sum = sum + rem*rem*rem;
//        }
//
//        return sum == original;
//    }
