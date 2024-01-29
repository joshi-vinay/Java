package t2_ConditionalsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().trim().charAt(0);
//        System.out.println(ch);
        if(ch>'a' && ch<'z'){
            System.out.println(ch + " is lowercase.");
        }
        else{
            System.out.println(ch + " is uppercase.");
        }
    }
}
