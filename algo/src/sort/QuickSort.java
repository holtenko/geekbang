package sort;

import java.util.Arrays;

/**
 * @author holten
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 8, 5, 1, 3, 2, 9};
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        quickSort(nums, 0, length - 1);
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(nums, 0, end);
        quickSort(nums, 0, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    public static int partition(int[] nums, int start, int end) {
        int pivotNum = nums[end];
        int leftIndex = start;
        for (int rightIndex = start; rightIndex < end; rightIndex++) {
            if (nums[rightIndex] < pivotNum) {
                int temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;
                leftIndex++;
            }
        }
        nums[end] = nums[leftIndex];
        nums[leftIndex] = pivotNum;
        return end;
    }
}
