package t3_Functions_Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in= new Scanner(System.in);
        System.out.print("Enter your friend's name: ");
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String naam) {
        String message = "Hello "+naam;
        return message;
    }

//    static String greet(){
//        String greeting = "How are you";
//        return greeting;
//    }

}
