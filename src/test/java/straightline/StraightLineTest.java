package straightline;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StraightLineTest {

    private StraightLine straightLine;

    @Before
    public void setUp() {
        straightLine = new StraightLine();
    }

    @Test
    public void checkStraightLine_1() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        assertTrue(straightLine.checkStraightLine(coordinates));
    }

    @Test
    public void checkStraightLine_2() {
        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        assertFalse(straightLine.checkStraightLine(coordinates));
    }

    @Test
    public void checkStraightLine_3() {
        int[][] coordinates = {{-3, -2}, {-1, -2}, {2, -2}, {-2, -2}, {0, -2}};
        assertTrue(straightLine.checkStraightLine(coordinates));
    }
}
