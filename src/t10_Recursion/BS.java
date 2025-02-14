package t10_Recursion;

//  Binary Search through Recursion.

public class BS {
    public static void main(String[] args) {
        int[] arr = {4,6,9,11,12,14,20,36,48};  //  Sorted Array in Ascending Order.
        int target = 4;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    static int binarySearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return binarySearch(arr, target, s, m - 1);
        }
        //  if target > arr[mid]
        return binarySearch(arr, target, m + 1, e);
    }
}
