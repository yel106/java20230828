package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Num1748Test {

    @Test
    void sumOfUnique() {
        Num1748 s = new Num1748();
        assertEquals(4, s.sumOfUnique(new int[]{1,2,3,2}));
        assertEquals(0, s.sumOfUnique(new int[]{1, 1, 1, 1, 1}));
        assertEquals(15, s.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
}