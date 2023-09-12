package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Num1684Test {

    @Test
    void countConsistentStrings() {
    Num1684 o = new Num1684();
    int i =o.countConsistentStrings("", new String[]{"ad","bd","aaab","baa","badab"});
    assertEquals(2, i);
    int j =o.countConsistentStrings("", new String[]{"a","b","c","ab","ac","bc","abc"});
    assertEquals(7, j);

    int k =o.countConsistentStrings("", new String[]{"cc","acd","b","ba","bac","bad","ac","d"});
    assertEquals(4, k);


    }
}