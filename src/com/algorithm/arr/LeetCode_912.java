package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2020/3/31 20:52
 */
public class LeetCode_912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
    // 递归结束条件：startIndex大等于endIndex的时候
        if (startIndex >= endIndex) {
            return;
        }
    // 得到基准元素位置
        int pivotIndex = partition(arr, startIndex, endIndex);
    // 用分治法递归数列的两部分
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
    // 取第一个位置的元素作为基准元素
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
    // 坑的位置，初始等于pivot的位置
        int index = startIndex;
    //大循环在左右指针重合或者交错时结束
        while (right >= left) {
    //right指针从右向左进行比较
            while (right >= left) {
                if (arr[right] < pivot) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
    //left指针从左向右进行比较
            while (right >= left) {
                if (arr[left] > pivot) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = pivot;
        return index;
    }
}
