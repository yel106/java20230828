package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Num1512 {
    public int numIdenticalPairs(int[] nums) {
        // [1, 2, 3, 1, 1, 3]

        // [1, 3] : 1+2
        // [2, 1] : 0
        // [3, 2] : 1

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                // 처음이 아니면
                map.put(num, map.get(num) + 1);
            } else {
                // 처음이면
                map.put(num, 1);
            }
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            int midSum = (value) * (value - 1) / 2;
            sum += midSum;
        }

        return sum;


        //stream으로 푸는 방법
//        return Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()))
//                .values()
//                .stream()
//                .map(n -> (n) * (n - 1) / 2)
//                .mapToInt(n -> n.intValue())
//                .sum();


    }

}
