package search;

/**
 * @author holten
 * @date 2021/2/16
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetIndex = binarySearch(nums, 5);
        int binarySearchRecursive = binarySearchRecursive(nums, 5);
        System.out.println(targetIndex);
        System.out.println(binarySearchRecursive);
    }

    public static int binarySearch(int[] nums, int target) {
        int length = nums.length;
        if (length < 1) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] nums, int target) {
        int length = nums.length;
        if (length < 1) {
            return -1;
        }
        return binarySearchRecursive(nums, target, 0, length - 1);
    }

    public static int binarySearchRecursive(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return binarySearchRecursive(nums, target, mid + 1, high);
        } else {
            return binarySearchRecursive(nums, target, low, mid - 1);
        }
    }
}
