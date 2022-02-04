package com.algorithm.arr;

import java.util.Arrays;

/**
 * @author zhangluyang
 * @2021/8/23 18:21
 */
public class LeetCode_1646 {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 2; i <= n; ++i) {
            nums[i] = nums[i / 2] + i % 2 * nums[i / 2 + 1];
        }
        return Arrays.stream(nums).max().getAsInt();

    }
}
