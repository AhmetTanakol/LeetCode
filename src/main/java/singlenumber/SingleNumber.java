package singlenumber;

import java.util.Arrays;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1

Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }
        return result;
    }

    public int singleNumberSolution2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // beginning of the array
            if (i == 0) {
                if (nums[i] != nums[i+1]) {
                    return nums[i];
                }
            } else if (i == (nums.length - 1)) {
                if (nums[i] != nums[i-1]) {
                    return nums[i];
                }
            } else {
                if (nums[i] != nums[i-1] && nums[i] != nums[i+1]) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}
