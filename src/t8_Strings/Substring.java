package t8_Strings;

public class Substring {
    public static void main(String[] args) {
        String str = "HelloWorld";
//        System.out.println(str.substring(0, 5));
        System.out.println(getSubString(str, 0, 5));
    }
    static String getSubString(String str, int si, int ei){
        String substring = "";
        for(int i = si; i<ei; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
}
