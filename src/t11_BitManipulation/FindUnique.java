package t11_BitManipulation;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for(int i = 0; i<arr.length; i++){
            unique ^= arr[i];   // order doesn't matter don't get confused it is similar to sum += arr[i];
        }
//        or
//        for (int j : arr) {
//            unique ^= j;   // order doesn't matter don't get confused it is similar to sum += arr[i];
//        }
        return unique;
    }
}
