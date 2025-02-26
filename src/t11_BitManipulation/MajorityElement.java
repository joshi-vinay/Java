package t11_BitManipulation;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(ans(arr));
    }
    static int ans(int[] arr) {
        //  Moore's Voting ALgo:

        int frequecy = 0, ans = 0;
        for (int i = 0; i<arr.length; i++){
            if(frequecy == 0){
                ans = arr[i];
            }
            if(ans == arr[i]){
                frequecy++;
            }else{
                frequecy--;
            }
        }
        return ans;
    }
}
