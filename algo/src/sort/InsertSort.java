package sort;

import java.util.Arrays;

/**
 * @author holten
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 8, 5, 1, 3, 2};
        int[] sortedNums = insertSort(nums);
        System.out.println(Arrays.toString(sortedNums));
    }

    public static int[] insertSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return nums;
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j]) {
                    int num_i = nums[i];
                    for (int k = i - 1; k >= j; k--) {
                        nums[k + 1] = nums[k];
                    }
                    nums[j] = num_i;
                }
            }
        }
        return nums;
    }
}
