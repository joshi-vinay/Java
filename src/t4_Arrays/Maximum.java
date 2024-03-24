package t4_Arrays;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter elements inside the array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int ans = MaxRange(arr,1,7);
//        System.out.println("The maximum element inside the given array is: "+ ans);
        System.out.println("The maximum element in the given range is: "+ ans);

    }
//    static int Max(int[] arr){
//        int max= arr[0];
//        for(int i = 1; i<arr.length; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//            return max;
//    }

    //  in a particular range:-
    static int MaxRange(int[] arr, int start, int end){
        if(arr==null){
            return -1;
        }
        int max = arr[start];
        for(int i = start; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
