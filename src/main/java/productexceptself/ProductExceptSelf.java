package productexceptself;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int last = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            answer[i] = last * answer[i];
            last = last * nums[i];
        }

        return answer;
    }
}
