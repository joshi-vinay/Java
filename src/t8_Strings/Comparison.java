package t8_Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Vinay";
        String b = "Vinay";

        System.out.println(a == b); // Output = true, Since both the reference variables are pointing to the same object.

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(2));

    }
}
