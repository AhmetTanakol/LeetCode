package subarraysumequalsk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraySumEqualsKTest {

    private SubarraySumEqualsK subarraySumEqualsK;

    @Before
    public void setUp() {
        subarraySumEqualsK = new SubarraySumEqualsK();
    }

    @Test
    public void subarraySum_1() {
        int[] nums = {1, 2, 3};
        int result = subarraySumEqualsK.subarraySum(nums, 3);
        assertEquals(2, result);
    }

    @Test
    public void subarraySum_2() {
        int[] nums = {1, 1, 1};
        int result = subarraySumEqualsK.subarraySum(nums, 2);
        assertEquals(2, result);
    }

    @Test
    public void subarraySum_3() {
        int[] nums = {1, 1, 2};
        int result = subarraySumEqualsK.subarraySum(nums, 2);
        assertEquals(2, result);
    }
}
