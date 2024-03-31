package t4_Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String input = "Hello World";
        String ans = Reverse(input);
        System.out.println(ans);
    }

    //  given a string "Hello World" output it in reverse i.e. "dlroW olleH"

    static String Reverse(String str){
        // Convert the string to a character array for easier manipulation
        char[] chars = str.toCharArray();

        int start = 0;
        int end = str.length()-1;
        while(start <= end){
            // Swap characters at start and end indices
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
