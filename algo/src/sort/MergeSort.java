package sort;

import java.util.Arrays;

/**
 * @author holten
 * @date 2021/2/16
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 8, 5, 1, 3, 2, 9};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        mergeSort(nums, 0, length - 1);
    }

    public static void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int[] result = new int[end - start + 1];
        int index = 0;
        int leftIndex = start;
        int rightIndex = mid + 1;

        while (leftIndex <= mid && rightIndex <= end) {
            if (nums[leftIndex] <= nums[rightIndex]) {
                result[index++] = nums[leftIndex++];
            } else {
                result[index++] = nums[rightIndex++];
            }
        }
        if (leftIndex > mid) {
            for (int i = rightIndex; i <= end; i++) {
                result[index++] = nums[i];
            }
        }
        if (rightIndex > end) {
            for (int i = leftIndex; i <= mid; i++) {
                result[index++] = nums[i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            nums[start + i] = result[i];
        }
    }
}
