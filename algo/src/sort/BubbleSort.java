package sort;

import java.util.Arrays;

/**
 * @author holten
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 8, 5, 1, 3, 2};
        int[] sortedNums = bubbleSort(nums);
        System.out.println(Arrays.toString(sortedNums));
    }

    public static int[] bubbleSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return nums;
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
        return nums;
    }
}
