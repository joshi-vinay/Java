package t4_Arrays;

public class Main {
    public static void main(String[] args) {
        //  Arrays:- Array is a data structure used to store a collection of data.
        //  Syntax:
//        datatype[] variable_name = new datatype[size];
//        e.g:
        //  Store 5 roll nos.
//        int[] rollno = new int[5];
//        or directly
//        int[] rollnos = {23,45,8,14,59};

        int[] rollno;   //  declaration of array: rollno is getting defined in the stack.
        rollno = new int[5];    //  initialization of array: actually here object is being created in the memory (heap).

        System.out.println(rollno[1]);
        //  String Array:-

        String[] arr = new String[4];
        System.out.println(arr[1]); //  null

        //  null is a special value which is the by default value of what reference variable point to.



    }

}
