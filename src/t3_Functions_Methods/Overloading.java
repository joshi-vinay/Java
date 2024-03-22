package t3_Functions_Methods;

public class Overloading {
    public static void main(String[] args) {
//        fun(52);
//        fun("Vinay Joshi");
        int ans = sum(2,3,10);
        System.out.println(ans);
    }
    static  int sum(int a, int b){
        return a+b;
    }
    static  int sum(int a, int b, int c){
        return a+b+c;
    }
//    static void fun(int a){
//        System.out.println(a);
//    }
//    static void fun(String name){
//        System.out.println(name);
//    }
}

/*  Two things we need to consider in order to have the same name:
    either the no. of arguments should be different or the type of arguments should be different.   */
