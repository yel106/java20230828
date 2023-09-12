package LeetCode;

import static org.junit.jupiter.api.Assertions.*;

class Num771Test {
    void numJewelsInStones() {
        Num771 o = new Num771();
        int i = o.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, i);

        int j = o.numJewelsInStones("z", "ZZ");
        assertEquals(0, j);
    }
}