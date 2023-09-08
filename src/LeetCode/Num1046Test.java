package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Num1046Test {

    @Test
    void lastStoneWeight() {
        Num1046 o1 = new Num1046();
        int result1 = o1.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1});
        assertEquals(1, result1);

        int result2 = o1.lastStoneWeight(new int[] {1});
        assertEquals(1, result2);

        int result3 = o1.lastStoneWeight(new int[] {2,2});
        assertEquals(0, result3);
    }
}