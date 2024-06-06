package t6_BinarySearch.Assignment;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);

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

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
