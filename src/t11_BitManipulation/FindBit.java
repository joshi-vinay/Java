package t11_BitManipulation;

public class FindBit {
    public static void main(String[] args) {
        int n = 182;
        int target = 5;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(ans(n, target)));
    }
    static int ans(int num, int target){
        int result = num & (1 << (target-1));
        if(result != 0){
            return 1;
        }else{
            return 0;
        }
    }
}
