package t11_BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int num = 86;
        int target = 5;
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));
//        String ans = Integer.toBinaryString(set(num,target));
        String ans = Integer.toBinaryString(reset(num,target));
        System.out.println(ans);
        System.out.println(Integer.parseInt(ans,2));
    }
    static int set(int n, int target){
        return n | (1 << (target-1));
    }
    static int reset(int n, int target){
        int mask = ~(1 << (target - 1));
        return n & mask;    // taking complement (~)("Bitwise NOT") of (1<<(target - 1));
    }
}
