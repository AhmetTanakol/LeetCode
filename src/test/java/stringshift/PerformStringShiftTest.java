package stringshift;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerformStringShiftTest {

    private PerformStringShift performStringShift;

    @Before
    public void setUp() {
        performStringShift = new PerformStringShift();
    }

    @Test
    public void stringShift_1() {
        int[][] shifts = {{0, 1}, {1, 2}};
        String result = performStringShift.stringShift("abc", shifts);
        assertEquals("cab", result);
    }

    @Test
    public void stringShift_2() {
        int[][] shifts = {{1, 1}, {1, 1}, {0, 2}, {1, 3}};
        String result = performStringShift.stringShift("abcdefg", shifts);
        assertEquals("efgabcd", result);
    }
}
