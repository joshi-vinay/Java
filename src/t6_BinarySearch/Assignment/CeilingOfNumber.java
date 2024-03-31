package t6_BinarySearch.Assignment;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};  //  Sorted Array in Ascending Order.
        int target = 15;
        int ans = Ceiling(arr, target);
        System.out.println(ans);

    }

    // return the index of smallest no >= target.
    static int Ceiling(int[] arr, int target) {
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}

