package t6_BinarySearch.Assignment;
//  Question Link:  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,13,15,20,23,30};
        int target = 15;
        int finalAns = ans(arr,target);
        System.out.println(finalAns);
    }
    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target>arr[end]){
            int newStart = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            // find the middle element
        //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start+(end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
