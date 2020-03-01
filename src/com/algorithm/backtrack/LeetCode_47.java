package com.algorithm.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangluyang
 * @2019/9/14 22:06
 */
public class LeetCode_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] flag=new boolean[nums.length];
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backTrack(result,list,0,nums,flag);
        return result;
    }

    private void backTrack(List<List<Integer>> result,List<Integer> list,int index,int[] nums,boolean[] flag){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!flag[i]){
                if (i > 0 && nums[i] == nums[i - 1] && !flag[i - 1]) {
                    continue;
                }
                   flag[i]=true;
                   list.add(nums[i]);
                   backTrack(result,list,index+1,nums,flag);
                   list.remove(list.size()-1);
                   flag[i]=false;

            }
        }
    }

    public static void main(String[] args) {
        LeetCode_47 l=new LeetCode_47();
        l.permuteUnique(new int[]{1,1,2});
    }

}
