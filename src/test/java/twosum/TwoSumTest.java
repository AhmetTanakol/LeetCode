package twosum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int[] indices = twoSum.twoSum(nums, 9);
        assertArrayEquals(new int[]{0, 1}, indices);
    }

    @Test
    public void twoSum_2() {
        int[] nums = {-3, 4, 3, 90};
        int[] indices = twoSum.twoSum(nums, 0);
        assertArrayEquals(new int[]{0, 2}, indices);
    }
}
