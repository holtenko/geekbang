package search;

/**
 * @author holten
 * @date 2021/2/16
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetIndex = binarySearch(nums, 0);
        System.out.println(targetIndex);
    }

    public static int binarySearch(int[] nums, int target) {
        int length = nums.length;
        if (length < 1) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        for (int i = 0; i < length; i++) {
            int mid = low + ((high - low) >> 1);
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return -1;
    }
}
