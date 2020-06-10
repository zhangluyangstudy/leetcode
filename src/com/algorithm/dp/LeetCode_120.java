package com.algorithm.dp;

import java.util.List;

/**
 * @author zhangluyang
 * @2020/4/13 16:20
 */
public class LeetCode_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[] dp=new int[size];
        for (int i = size; i >=0 ; i--) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j++) {
                int t1=0;

            }

        }
        return 0;
    }
}
