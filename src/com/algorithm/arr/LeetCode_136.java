package com.algorithm.arr;

/**
 * 重叠区域
 * @author zhangluyang
 * @2020/3/18 21:13
 */
public class LeetCode_136 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] ||
                rec1[3] <= rec2[1] ||
                rec1[0] >= rec2[2] ||
                rec1[1] >= rec2[3]);
    }
}
