package rotatedsortedarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotatedSortedArrayTest {

    private RotatedSortedArray rotatedSortedArray;

    @Before
    public void setUp() {
        rotatedSortedArray = new RotatedSortedArray();
    }

    @Test
    public void search_1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = rotatedSortedArray.search(nums, 0);
        assertEquals(4, result);
    }

    @Test
    public void search_2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = rotatedSortedArray.search(nums, 3);
        assertEquals(-1, result);
    }

    @Test
    public void search_3() {
        int[] nums = {};
        int result = rotatedSortedArray.search(nums, 3);
        assertEquals(-1, result);
    }
}
