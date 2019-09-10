package com.algorithm.arr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_46 {
    List<List<Integer>> res = new ArrayList<>();


    public List<List<Integer>> permute(int[] nums) {
        res.clear();
        dfs(nums, 0);//
        return res;
    }

    public void dfs(int[] n, int start) {//start表示要被替换元素的位置
        if (start >= n.length) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i : n) {
                list.add(i);
            }
            res.add(list);
            return;
        }

        for (int i = start; i < n.length; i++) {//i从start开始，如果从start+1开始的话，会把当前序列遗漏掉直接保存了下一个序列
            int temp = n[i];
            n[i] = n[start];
            n[start] = temp;
            dfs(n, start + 1);//递归下一个位置
            //回到上一个状态
            n[start] = n[i];
            n[i] = temp;
        }
    }


    @Test
    public void test1(){
        permute(new int[]{1,2,3,4,5});
    }

}
