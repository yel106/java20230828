package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Num1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        //배열에서 최대값 구하기
        int max = 0; //가장 작은 값이 1이니까 max=0으로 둠
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        //for문을 끝내고 나온 max가 5임

//        //extra와 더해서 max보다 크거나 같은지를 arraylist에 추가
//        // [2, 3, 5, 1, 3 ]
//        list.add((2+3) >=5 ); //true
//        list.add((3+3) >=5 ); //true
//        list.add((5+3) >=5 ); //true
//        list.add((1+3) >=5 ); //false
//        list.add((3+3) >=5 ); //true
        for (int candy : candies) {
            list.add((candy + extraCandies) >= max);
        }

        return list;

}

//다른 방법으로 푼것.
//public class Study {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max= 0;
//        List<Boolean> result = new ArrayList<>();
//
//            for(int i=0; i< candies.length; i++) {
//                if( candies[i] > max)
//                    max= candies[i];
//            }
//             for(int j=0; j< candies.length; j++) {
//                if(candies[j] + extraCandies >= max)
//                    result.add(true);
//
//                }
//        return result;
//    }
//    }
//}

}
