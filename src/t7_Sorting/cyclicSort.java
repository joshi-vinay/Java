package t7_Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
            while(i<arr.length){

            int value = arr[i];
            //  index = value - 1;
            int index = value - 1;
            if(i != index) {
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
