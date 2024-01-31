package t2_ConditionalsAndLoops;

public class Occurrence {
    public static void main(String[] args) {
        //  Counting the occurrence of 7.
        int n = 1385757879;
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == 7){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
