package letterfrequency;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void frequencySort() {
        String input = "tree";
        assertEquals("eetr", solution.frequencySort(input));
    }

    @Test
    public void frequencySort_2() {
        String input = "Aabb";
        assertEquals("bbAa", solution.frequencySort(input));
    }

    @Test
    public void frequencySort_3() {
        String input = "his s he a ha he  ha ae";
        assertEquals("        hhhhhaaaaeeessi", solution.frequencySort(input));
    }
}
