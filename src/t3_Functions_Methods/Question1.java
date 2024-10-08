package t3_Functions_Methods;

import java.util.Scanner;

//  return true if a number is Prime else return false
public class Question1 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = in.nextInt();

//        boolean ans = isPrime(n);   //  isPrime.
//        System.out.println(ans);
        System.out.println("Prime numbers between 1 to 100 are: ");
        for(int i = 2; i<=100; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
