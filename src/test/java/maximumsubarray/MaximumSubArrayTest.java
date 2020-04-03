package maximumsubarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubArrayTest {

    private MaximumSubArray maximumSubArray;

    @Before
    public void setUp() {
        maximumSubArray = new MaximumSubArray();
    }

    @Test
    public void maxSubArray_1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maximumSubArray.maxSubArray(nums);
        assertEquals(6, result);
    }

    @Test
    public void maxSubArray_2() {
        int[] nums = {-2, -1};
        int result = maximumSubArray.maxSubArray(nums);
        assertEquals(-1, result);
    }
}
