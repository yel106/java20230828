package ch15collection.Solution;

import java.util.*; //util에 있는 모든걸 끌고 온다는 얘기

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= 0;

        for (int candy : candies
             ) {
            max = Math.max(max, candy);

        }

        List<Boolean> result = new ArrayList<>();
        for ( int candy: candies
             ) {
            result.add(candy+extraCandies >= max);


        }
        return result;



    }



}
