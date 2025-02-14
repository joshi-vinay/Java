package t10_Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //  Base Condition:
        if(n == 5){
            System.out.println("5");
            return;
        }
        System.out.println(n);

        //  Recursive Call
        //  if you are calling a function again & again you can treat it as a separate call in the stack.

        //  this is called tail recursion.
        //  this is the last function  call.
        print(n + 1);
    }
}
