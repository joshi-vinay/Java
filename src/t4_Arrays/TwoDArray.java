package t4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("2D Arrays");

        int[][] arr = new int[4][3];
        Scanner in = new Scanner(System.in);
        //  Input:
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
