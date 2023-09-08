package LeetCode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Num1431Test {

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void kidsWithCandies() {
        Num1431 o1 = new Num1431();
        List<Boolean> list =o1.kidsWithCandies(new int[] {2,3, 5, 1, 3}, 3);
        // 리트코드에 있는 예시를 써서 확인해보면 됨

        assertEquals(List.of(true, true, true, false, true), list); //첫번쨰는 기대하는 값, list는 output

        List<Boolean> list1 = o1.kidsWithCandies(new int[] {4,2, 1, 1, 2}, 1);
        assertEquals(List.of(true, false, false, false, false), list1);
//        assertEquals(List.of(true, false, false, false, true), list1); //잘못 입력하면 내용이 뜸


    }
}