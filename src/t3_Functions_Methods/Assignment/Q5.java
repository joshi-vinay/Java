package t3_Functions_Methods.Assignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*  Write a program to print the circumference and area of a circle of radius entered
         by user by defining your own method.   */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        float radius = in.nextFloat();
        float cir = Circumference(radius);
        float area = Area(radius);
        System.out.println("The circumference of the circle is: "+cir);
        System.out.println("The area of the circle is: "+area);
    }
    static float Circumference(float r){
        return 2*(float)3.14*r;
    }
    static float Area(float r){
    return (float)3.14*r*r;

    }
}
