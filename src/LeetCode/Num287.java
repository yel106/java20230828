package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Num287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // [3, 1, 3, 4, 2]
        for (int num : nums) {
            if ( set.contains(num) ) {  //num이 있다면 중복된 수 num을 return해라
                return num;
            }
            set.add(num);
        }






        return 0;
    }


}
