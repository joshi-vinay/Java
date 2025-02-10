package t8_Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcddddee";
        System.out.println(compress(str));
    }
    static StringBuilder compress(String str){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
        int count = 1;
        while(i<str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        builder.append(str.charAt(i));
        if(count>1){
            builder.append(count);
        }
        }
        return builder;
    }
}
