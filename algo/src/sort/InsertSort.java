package sort;

import java.util.Arrays;

/**
 * @author holten
 * @date 2021/2/16
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 8, 5, 1, 3, 2};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
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
    }
}
