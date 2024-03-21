package t3_Functions_Methods;

public class Shadowing {
    static int x = 10;  //  this will be shadowed at line 10.
    public static void main(String[] args) {
        System.out.println(x);  //  10
        int x; //  the class variable at line 4 is shadowed by this.
//        System.out.println(x);  //    scope will begin when value is initialized.
        x = 40; //  here the value is initialized, in line 7 the variable is declared not initialized.
        System.out.println(x);  //  40
        program();  //  10
    }
    static void program(){
        System.out.println(x);

    }
}
