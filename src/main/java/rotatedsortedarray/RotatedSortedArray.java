package rotatedsortedarray;

public class RotatedSortedArray {

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (target == nums[mid]) {
                return mid;
            } else {
                if (target < nums[mid]) {
                    if (nums[mid] < nums[0] == target < nums[0]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (nums[mid] < nums[0] == target < nums[0]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }

        return -1;
    }
}
