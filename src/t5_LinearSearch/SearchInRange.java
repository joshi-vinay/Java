package t5_LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        if(size <= 0){
            System.out.print("Array size should be greater than 0");
            return;
        }
        int[] arr = new int[size];
        System.out.print("Enter the elements inside the array: ");
        for(int i = 0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter range of the indexes between which you want to search the element: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print("Enter the element you want to search: ");
        int element = in.nextInt();
        int ans = Search(arr,a,b,element);  //  calling the function..
        System.out.println(ans);

    }
    static int Search(int[] arr, int a, int b, int target){

        for(int index = a; index<=b; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
