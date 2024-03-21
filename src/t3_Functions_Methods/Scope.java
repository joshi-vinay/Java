package t3_Functions_Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Akshay";
        {   /*  bound scope */
//            int a = 30;
            /*  you can't initialize it again bcz this block is inside the main method and variable 'a'
             is initialized already in the main method, but you can modify the variable.  */
            a = 40; //  reassign the original ref variable to some other value.
            System.out.println(a);
            int c = 30; //  values initialized in this block will remain in block.

            name = "Vinay";
            System.out.println(name);
        }
        int c = 70;
//        System.out.println(c);  //  cannot be used outside the block.
        System.out.println(name);
//        System.out.println(marks);    /*  function scope    */

        //  Scoping in for loop:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            int num = 10;
//            int a = 5;
            a = 540;

        }

        /*  So to conclude anything that is initialized outside you can use/update(not initialize again) inside
        the block scope but anything that is initialized inside the block scope you can't use that outside it,
         but you can initialize it again outside.   */

    }
    static void random(int marks){
//        System.out.println(a);

        int num = 98;
        int a = 5;
        System.out.println(num);
        System.out.println(marks);

    }
}
