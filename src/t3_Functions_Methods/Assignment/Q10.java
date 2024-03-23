package t3_Functions_Methods.Assignment;

public class Q10 {
    public static void main(String[] args) {
        //  Write a function that returns the sum of first n natural numbers.
        System.out.print("The sum of first 10 natural numbers is: ");
        int ans =Natural();
        System.out.print(ans);
    }
    static int Natural(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum +=i;
        }
        return sum;
    }
}
