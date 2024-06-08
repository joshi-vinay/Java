package t6_BinarySearch.Assignment;

//  Find how many times the array is rotated in the rotated sorted array.

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {1,2,3,4,5,6,7};
        int ans = countRotations(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }

    private static int countRotations(int[] arr) {
         int pivot = FindPivot(arr);
         return pivot + 1;
    }
    static int FindPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
