package t3_Functions_Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
//        fun(2,3,5,7,8,7,5,6,2);
//        multiple(2,4,"Vinay", "Akshay", "Sumit", "Paras");
        demo(2,4,8,9);
        demo("Vinay","Kunal");

    }

    //  Overloading in VarArgs:-
    static void demo(int ...v) {System.out.println(Arrays.toString(v));}
    static void demo(String ...name){
        System.out.println(Arrays.toString(name));
    }
    static void multiple(int a, int b, String ...v){    //  variable length arguments always at the end.
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) {System.out.println(Arrays.toString(v));
    }
}
