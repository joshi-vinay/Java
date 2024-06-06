package t6_BinarySearch.Assignment;

//  Question Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class MountainArray {
    public static void main(String[] args) {
    int[] arr = {1,2,3,5,6,4,3,2};
    int ans = peakIndexInMountainArray(arr);
        System.out.println("The index of the peak element in the given array is: " + ans);
    }
    static int peakIndexInMountainArray(int[] arr) {
//        arr = {1,2,3,5,6,4,3,2};
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{   //  arr[mid]<arr[mid+1]
                start = mid + 1;
            }
        }
        return start;   //  or end as both are equal.
    }
}
