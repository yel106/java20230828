package LeetCode;

import ch15collection.Solution.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Num844Test {

    @Test
    void backspaceCompare() {
        Num844 o = new Num844();
        assertEquals(true, o.backspaceCompare("ab#c", "ad#c"));
        assertEquals(true, o.backspaceCompare("ab##", "c#d#"));
        assertEquals(false, o.backspaceCompare("a#c", "b"));
        assertEquals(true, o.backspaceCompare("a##c", "#a#c"));
    }
}