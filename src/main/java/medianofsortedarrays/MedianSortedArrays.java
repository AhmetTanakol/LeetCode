package medianofsortedarrays;

import java.util.ArrayList;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
public class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        int counterOfArray1 = 0;
        int counterOfArray2 = 0;
        while(counterOfArray1 < nums1.length && counterOfArray2 < nums2.length) {
            if(nums1[counterOfArray1] >= nums2[counterOfArray2]) {
                sortedList.add(nums2[counterOfArray2]);
                counterOfArray2++;
            } else {
                sortedList.add(nums1[counterOfArray1]);
                counterOfArray1++;
            }
        }

        // if we finished traversing array 1, just insert all the elements of array 2
        if (counterOfArray1 == nums1.length) {
            inserRestOfElementsIntoList(nums2, counterOfArray2, sortedList);
        }

        // if we finished traversing array 2, just insert all the elements of array 1
        if (counterOfArray2 == nums2.length) {
            inserRestOfElementsIntoList(nums1, counterOfArray1, sortedList);
        }

        return findMedianOf(sortedList);
    }

    private double findMedianOf(ArrayList<Integer> nums) {
        if (nums.size() % 2 == 0) {
            return ((double) (nums.get(nums.size() / 2) + nums.get((nums.size() - 1) / 2))) / 2;
        } else {
            return (double) nums.get(nums.size() / 2);
        }
    }

    private void inserRestOfElementsIntoList(int[] array, int currentIndex, ArrayList<Integer> list) {
        for(int i = currentIndex; i < array.length; i++) {
            list.add(array[i]);
        }
    }
}
