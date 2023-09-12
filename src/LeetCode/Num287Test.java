package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Num287Test {

    @Test
    void findDuplicate() {
        Num287 o = new Num287();
        int num1 =o.findDuplicate(new int[]{1, 3, 4, 2, 2});
        assertEquals(2, num1);

        int num2 = o.findDuplicate(new int[] {3, 1, 3, 4, 2});
        assertEquals(2, num1);

    }
}