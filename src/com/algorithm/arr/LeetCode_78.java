package com.algorithm.arr;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2019/9/12 10:22
 */
public class LeetCode_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;
    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        LeetCode_78 l=new LeetCode_78();
        List<List<Integer>> subsets = l.subsets(new int[]{1,2,3});
        System.out.println(subsets.size());

    }

}
