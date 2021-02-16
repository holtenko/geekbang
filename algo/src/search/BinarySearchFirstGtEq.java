package search;

/**
 * @author holten
 * @date 2021/2/16
 */
public class BinarySearchFirstGtEq {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 7, 7, 7, 8, 9};
        int targetIndex = binarySearchFirstGtEq(nums, 5);
        System.out.println(targetIndex);
    }

    public static int binarySearchFirstGtEq(int[] nums, int target) {
        int length = nums.length;
        if (length < 1) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (target <= nums[mid]) {
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
