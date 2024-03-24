package t4_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter elements inside the array:"+" ");
//        //  array of primitives:-
//        int[] arr = new int[5];
////        arr[0] = 23;
////        arr[1] = 45;
////        arr[2] = 75;
////        arr[3] = 82;
////        arr[4] = 9;
//        //  [23,45,75,82,9]
////        System.out.println(arr[1]);
//        for(int i=0; i<arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//            System.out.print("The array is: ");
//        for (int i = 0; i < arr.length; i++) {    // 1st method to print an array.
//            System.out.print(arr[i]+" ");
//        }
        //  enhanced version of for loop:-
        // 2nd method to print an array.
//        for (int num : arr) {   //  for every element in the array print the element.
//            System.out.print(num + " ");    //  here num represents the element of the array.
//        }
//        System.out.println(Arrays.toString(arr));   // 3rd method to print an array.

        //  array of objects:-
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="Vinay";
        System.out.println(Arrays.toString(str));

    }
}
