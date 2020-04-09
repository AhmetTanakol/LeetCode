package backspacestringcompare;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackSpaceStringCompareTest {

    private BackSpaceStringCompare backSpaceStringCompare;

    @Before
    public void setUp() {
        backSpaceStringCompare = new BackSpaceStringCompare();
    }

    @Test
    public void backspaceCompare_1() {
        assertTrue(backSpaceStringCompare.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void backspaceCompare_2() {
        assertTrue(backSpaceStringCompare.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void backspaceCompare_3() {
        assertTrue(backSpaceStringCompare.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void backspaceCompare_4() {
        assertFalse(backSpaceStringCompare.backspaceCompare("a#c", "b"));
    }
}
