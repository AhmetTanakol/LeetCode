package binarysearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @Before
    public void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void hasElement_1() {
        int target = 5;
        int[] nums = {1, 2, 3, 4, 5};
        assertTrue(binarySearch.hasElement(target, nums));
    }

    @Test
    public void hasElement_2() {
        int target = 5;
        int[] nums = {1, 2, 3, 4};
        assertFalse(binarySearch.hasElement(target, nums));
    }

    @Test
    public void hasElement_3() {
        int target = 5;
        int[] nums = {1, 2, 3, 4, 7, 8};
        assertFalse(binarySearch.hasElement(target, nums));
    }

    @Test
    public void hasElement_4() {
        int target = 3;
        int[] nums = {1, 2, 3, 4, 7, 8};
        assertTrue(binarySearch.hasElement(target, nums));
    }

    @Test
    public void hasElement_5() {
        int target = 3;
        int[] nums = {};
        assertFalse(binarySearch.hasElement(target, nums));
    }

    @Test
    public void hasElement_6() {
        int target = 3;
        int[] nums = {4};
        assertFalse(binarySearch.hasElement(target, nums));
    }

    @Test
    public void hasElement_7() {
        int target = 3;
        int[] nums = {3};
        assertTrue(binarySearch.hasElement(target, nums));
    }
}
