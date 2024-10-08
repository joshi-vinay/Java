package t4_Arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Syntax:-
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(65);
//        list.add(54);
//        list.add(354);
//        list.add(85);
//        list.add(686);
//        list.add(7);
//        list.add(564);
//        list.add(234);
//        list.add(67);
//        list.add(2354);
//        list.add(562);
//        list.add(187);
//        System.out.println(list);
//        System.out.println(list.contains(562));
//        list.set(1,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        //  input:-
        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        //  get item at any index:-
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");  // Pass index here.
        }
    }
}
