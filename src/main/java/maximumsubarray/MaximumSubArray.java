package maximumsubarray;

/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaximumSubArray {

    // Kadene's algorithm
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int currentMax = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currentMax = Math.max(currentMax, 0) + nums[i];

            if (currentMax > max) {
                max = currentMax;
            }
        }

        return max;
    }
}
