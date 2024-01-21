import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Program to add two numbers :)");
        System.out.print("Enter the value of a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.print("The sum of " + a + " and " + b + " is: " + sum);
    }
}
