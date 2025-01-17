package t7_Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
//        int[] arr = {3, 0, 2, 1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
            while(i<arr.length){

                //  for 0 to n:
//                int value = arr[i];
//                if(i != value) {
//                swap(arr, i, value);
//            }
                //  for 1 to n:
                int value = arr[i];
                int index = value - 1;
                if(i != index){
                    swap(arr, i, index);
                }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
