package com.Interview.dp;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/3/24 21:45
 */
public class LeetCode_1716 {
    public int massage(int[] nums) {
        int length=nums.length;
        if (length==0){
            return 0;
        }
        if(length==1){
            return nums[0];
        }
        if(length==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for (int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }

        return dp[nums.length-1];
    }
    @Test
    public void test(){
     int[] nums=new int[]{1,2,3,1};
        System.out.println(massage(nums));
    }
}
