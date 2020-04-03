package medianofsortedarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianSortedArraysTest {

    private static final double DELTA = 1e-15;

    private MedianSortedArrays medianSortedArrays;

    @Before
    public void setUp() {
        medianSortedArrays = new MedianSortedArrays();
    }

    @Test
    public void findMedianSortedArrays_1() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double result = medianSortedArrays.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result, DELTA);
    }

    @Test
    public void findMedianSortedArrays_2() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double result = medianSortedArrays.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result, DELTA);
    }

    @Test
    public void findMedianSortedArrays_3() {
        int[] nums1 = {3,3,3,3,4,5,6,6,6,7,7,7,7,8,12,35,35,36};
        int[] nums2 = {1,1,1,1,1,2,2,2,2,2,10,15};
        double result = medianSortedArrays.findMedianSortedArrays(nums1, nums2);
        assertEquals(4.5, result, DELTA);
    }
}
