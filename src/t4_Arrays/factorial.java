package t4_Arrays;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //  input five numbers and print their factorials:
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements inside the array: " + " ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        // Calculate and print factorial of each number
        for (int i = 0; i < size; i++) {
            int ans = facto(arr[i]);
            System.out.println("The factorial of " + arr[i] + " is: " + ans);
        }

    }
    static int facto(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
