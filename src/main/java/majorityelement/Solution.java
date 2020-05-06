package majorityelement;

public class Solution {
    public int majorityElement(int[] nums) {
        int leader = nums[0], leader_count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == leader) leader_count++;
            else {
                leader_count--;
                if (leader_count == 0) {
                    if (i < nums.length - 1) {
                        leader = nums[i + 1];
                        leader_count = 1;
                        i++;
                    }
                }
            }
        }

        return leader;
    }
}
