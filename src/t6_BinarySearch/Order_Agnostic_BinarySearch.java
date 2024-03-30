package t6_BinarySearch;

public class Order_Agnostic_BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {-2, -1, 4, 6, 7, 9, 14, 26, 34, 48};
        int target1 = -1;
        int[] arr2 = {99, 87, 76, 68, 52, 49, -31, 14, 8};
        int target2 = -31;
        int ans1 = IncreasingOrder(arr1,target1);
        int ans2 = DecreasingOrder(arr2,target2);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    /*
      1st Approach:   In first approach we have made two separate functions for increasing and decreasing
      order array which hinders code re-usability, so to  improve code maintainability and reduce redundancy
      we have combine these two functions into one in approach 2nd and 3rd.
     */

    static int IncreasingOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    return middle;
                }
            }
        }
        return -1;
    }

    static int DecreasingOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > arr[end]) {
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (target < arr[middle]) {
                    start = middle + 1;
                } else if (target > arr[middle]) {
                    end = middle - 1;
                } else {
                    return middle;
                }
            }
        }
        return -1;
    }

    //  2nd Approach:   src:- Kunal's DSA Bootcamp
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

    //  3rd Approach:
    static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (arr[start] < arr[end]) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }
            } else if (arr[start] > arr[middle]) {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                }
            }
        }

        return -1;
    }
}

