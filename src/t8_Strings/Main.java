package t8_Strings;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8};
        int num = 10;
        String name = "Vinay Joshi";
        System.out.println(name);

        //  This example effectively showcases both immutability and String Pool behavior! :-
        String a = "Rahul";
        System.out.println(a);
        a = "Joshi";    //  here new object named 'Joshi' is created in the string pool in heap memory, and now variable 'a' points to Joshi and the old string "Rahul" is not modified.
        System.out.println(a);
        String b = "Rahul"; //  Here, the JVM checks the String Pool and finds the existing object "Rahul", Instead of creating a new object, 'b' points to the same "Rahul" object.
        System.out.println(b);  //  Output: Rahul

        //  Garbage Collection: The "Rahul" object will only be eligible for garbage collection if there are no active references to it (e.g., if b also points elsewhere).

    }
}
