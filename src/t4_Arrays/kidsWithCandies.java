package t4_Arrays;
/*
Question Link:-
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/1214406198
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> answer = kids(candies,extra);
        System.out.println(answer);
    }
    static List<Boolean> kids(int[] candies, int extraCandies){
        int maxCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }

        //   Initialize a list to store the results
        List<Boolean> result = new ArrayList<>();
        // Check if each kid can have the greatest number of candies by adding extraCandies
        for(int i = 0; i<candies.length; i++){
            int ans = candies[i]+extraCandies;
            if(ans >= maxCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;

    }
}
