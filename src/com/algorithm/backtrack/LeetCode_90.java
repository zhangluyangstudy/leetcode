package com.algorithm.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangluyang
 * @2019/9/13 22:18
 */
public class LeetCode_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backTrack(result,list,0,nums);
        return result;
    }

    private void backTrack(List<List<Integer>> result,List<Integer> list,int n,int[] nums){
        result.add(new ArrayList<>(list));
        for(int i=n;i<nums.length;i++){
            if(i>n&&nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            backTrack(result,list,i+1,nums);
            list.remove(list.size()-1);
        }
    }
}
