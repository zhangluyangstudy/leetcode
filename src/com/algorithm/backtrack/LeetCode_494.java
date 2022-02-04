package com.algorithm.backtrack;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2021/6/7 14:48
 */
public class LeetCode_494 {
    int result=0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(target,0,nums,0);
        return result;
    }

    private void backtrack(int target, int index, int[] nums, int sum) {
        System.out.println("sum is "+sum);
        if(nums.length==index){
            if(target==sum){
                result++;
            }
            return;
        }else{
            backtrack(target,index+1,nums,sum+nums[index]);
            backtrack(target,index+1,nums,sum-nums[index]);
        }
    }
    @Test
    public void test(){
        int[] nums={1};
        System.out.println(findTargetSumWays(nums, 1));
    }
}
