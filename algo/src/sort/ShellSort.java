package sort;

import java.util.Arrays;

/**
 * @author holten
 * @date 2021/2/16
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 8, 5, 1, 3, 2, 9};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void shellSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        for (int gap = length / 2; gap >= 1; gap = gap / 2) {
            for (int i = 0; i < length; i = i + gap) {
                for (int j = 0; j < i; j = j + gap) {
                    if (nums[i] < nums[j]) {
                        int num_i = nums[i];
                        for (int k = i - gap; k >= j; k = k - gap) {
                            nums[k + gap] = nums[k];
                        }
                        nums[j] = num_i;
                    }
                }
            }
        }
    }
}
