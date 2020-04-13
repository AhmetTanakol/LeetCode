package contiguousarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContiguousArrayTest {

    private ContiguousArray contiguousArray;

    @Before
    public void setUp() {
        contiguousArray = new ContiguousArray();
    }

    @Test
    public void findMaxLength_1() {
        int[] nums = {0, 1};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(2, result);
    }

    @Test
    public void findMaxLength_2() {
        int[] nums = {0, 1, 0};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(2, result);
    }

    @Test
    public void findMaxLength_3() {
        int[] nums = {0, 0};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(0, result);
    }

    @Test
    public void findMaxLength_4() {
        int[] nums = {0, 1, 1};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(2, result);
    }

    @Test
    public void findMaxLength_5() {
        int[] nums = {};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(0, result);
    }

    @Test
    public void findMaxLength_6() {
        int[] nums = {1};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(0, result);
    }

    @Test
    public void findMaxLength_7() {
        int[] nums = {1, 0, 0, 1};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(4, result);
    }

    @Test
    public void findMaxLength_8() {
        int[] nums = {1, 0, 1, 0, 1};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(4, result);
    }

    @Test
    public void findMaxLength_9() {
        int[] nums = {0, 0, 0, 0, 1, 1, 1};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(6, result);
    }

    @Test
    public void findMaxLength_10() {
        int[] nums = {0, 0, 0, 1, 1, 1, 1};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(6, result);
    }

    @Test
    public void findMaxLength_11() {
        int[] nums = {0, 0, 0, 1, 1, 1, 0};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(6, result);
    }

    @Test
    public void findMaxLength_12() {
        int[] nums = {0, 0, 1, 0, 0, 0, 1, 1};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(6, result);
    }

    @Test
    public void findMaxLength_13() {
        int[] nums = {0, 1, 1, 0, 1, 1, 1, 0};
        int result = contiguousArray.findMaxLength(nums);
        assertEquals(4, result);
    }
}
