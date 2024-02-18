package t2_ConditionalsAndLoops;

import java.util.Scanner;

public class fourDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 4 digit number: ");
        int num = in.nextInt();
        if(num>=1000 && num<=9999){
            int product = 1;
            int rem;
            while(num!=0){
                rem = num%10;
                product *= rem;
                num/=10;
            }
            System.out.println("The product of the digits is: "+product);

        }
        else{
            System.out.println("The number is not a valid 4 digit number");
        }


        }
    }