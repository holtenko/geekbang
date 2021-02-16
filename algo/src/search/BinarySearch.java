package search;

import java.util.Arrays;

/**
 * @author holten
 * @date 2021/2/16
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 8, 5, 1, 3, 2};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
