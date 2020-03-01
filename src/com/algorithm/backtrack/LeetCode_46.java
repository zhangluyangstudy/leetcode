package com.algorithm.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2019/9/13 18:01
 */
public class LeetCode_46 {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] flag=new boolean[nums.length];
        List<List<Integer>> result=new ArrayList<>();
        backTrack(flag,0,result,new ArrayList<Integer>(),nums);
        return result;
    }

    private void backTrack(boolean[] flag,int n,List<List<Integer>> result,List<Integer> list,int[] nums){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!flag[i]){
                list.add(nums[i]);
                flag[i]=true;
                backTrack(flag,n+1,result,list,nums);
                flag[i]=false;
//                list=new ArrayList<>();
                list.remove(n);
            }
        }

    }

    public static void main(String[] args) {
        LeetCode_46 l=new LeetCode_46();
        l.permute(new int[]{1,2,3});
    }
}
