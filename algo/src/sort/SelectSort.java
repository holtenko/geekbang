package sort;

import java.util.Arrays;

/**
 * @author holten
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 8, 5, 1, 3, 2};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (nums[j] <= nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
