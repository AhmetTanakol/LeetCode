package laststoneweight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneWeigthTest {

    private LastStoneWeigth lastStoneWeigth;

    @Before
    public void setUp() {
        lastStoneWeigth = new LastStoneWeigth();
    }

    @Test
    public void lastStoneWeight_1() {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int result = lastStoneWeigth.lastStoneWeight(stones);
        assertEquals(1, result);
    }

    @Test
    public void lastStoneWeight_2() {
        int[] stones = new int[]{4, 1};
        int result = lastStoneWeigth.lastStoneWeight(stones);
        assertEquals(3, result);
    }

    @Test
    public void lastStoneWeight_3() {
        int[] stones = new int[]{1, 1};
        int result = lastStoneWeigth.lastStoneWeight(stones);
        assertEquals(0, result);
    }

    @Test
    public void lastStoneWeight_4() {
        int[] stones = new int[]{2};
        int result = lastStoneWeigth.lastStoneWeight(stones);
        assertEquals(2, result);
    }
}
