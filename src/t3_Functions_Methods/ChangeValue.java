package t3_Functions_Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {0,1,5,8,15};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
//  Passed by the copy of the value of the reference variable.
    static void change(int[] nums) {
            nums[0] = 99;
//        int[] arri = {5,4,1,9,2};
        /*  so don't have the doubt that why string didn't get changed in the swap method because there we created
          a new object rather modifying the string, whereas here we are modifying the array so arr[0] will get
          changed to 99.    */
        /*  So , in short if you make a change to the object via the ref variable, same object will be changed.  */

    }
}
