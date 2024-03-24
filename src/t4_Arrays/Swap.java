package t4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter elements inside the array: ");
        int [] arr = new int[6];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        swap(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Swap {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter elements inside the array: ");
//        int[] arr = new int[6];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        // Now that the array is filled with user input, swap elements
//        System.out.print("Enter indices to swap: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        Swap(arr, a, b);
//
//        System.out.println("Array after swapping: " + Arrays.toString(arr));
//    }
//
//    static void Swap(int[] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }
//}
