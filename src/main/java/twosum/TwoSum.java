package twosum;


import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> requiredNumbersMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(requiredNumbersMap.containsKey(nums[i])) {
                return new int[]{requiredNumbersMap.get(nums[i]), i};
            }
            int requiredNumber = target - nums[i];
            requiredNumbersMap.putIfAbsent(requiredNumber, i);
        }

        return new int[]{-1, -1};
    }
}
