package t8_Strings;

public class LargestStringLexicographically {
    public static void main(String[] args) {
        String[] fruits = {"apple", "Mango", "banana"};

        String largest = fruits[0];
        for(int i = 1; i<fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){   //  means if largest < fruits[i].
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
