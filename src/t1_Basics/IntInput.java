package t1_Basics;
import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
//        System.out.print("Enter some input: ");
        Scanner input = new Scanner(System.in);
        //Taking integer as an input
//        int roll_no = input.nextInt();
//        System.out.println("Your roll No is: " + roll_no);
//
//        int a = 234_000_000;
//        System.out.println(a);

        // Taking string as input
//        System.out.print("Enter a string: ");
//        String greet = input.nextLine();
//        System.out.println(greet);

        //Taking float value as input
        System.out.print("Enter your percentage: ");
        float marks = input.nextFloat();
        System.out.println("Your percentage is: " + marks);
    }
}
