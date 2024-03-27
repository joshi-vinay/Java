package t6_BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    //  return the index.
    //  return -1 if it doesn't exist.
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end - start)/2;
            if (target < arr[middle]){
                end = middle-1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
