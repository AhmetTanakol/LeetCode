package threesum;

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solutions = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> visitedNums = new HashSet<>();
        Set<String> duplicateSolutions = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (visitedNums.contains(nums[i])) {
                continue;
            }
            int requiredNum = 0 - nums[i];
            map.clear();
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (map.containsKey(nums[j])) {
                        List<Integer> numbers = new ArrayList<>();
                        numbers.add(nums[i]);
                        numbers.add(map.get(nums[j]));
                        numbers.add(nums[j]);
                        Collections.sort(numbers);
                        String key = numbers.get(0) + "_" + numbers.get(1) + "_" + numbers.get(2);
                        if (!duplicateSolutions.contains(key)) {
                            solutions.add(numbers);
                        }
                        duplicateSolutions.add(key);
                    } else {
                        int n = requiredNum - nums[j];
                        map.put(n, nums[j]);
                    }
                }
            }
            visitedNums.add(nums[i]);
        }

        return solutions;
    }
}
