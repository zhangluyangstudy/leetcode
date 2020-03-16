package com.algorithm.dp;

import java.util.Arrays;

/**
 * 最长上升子序列
 * @author zhangluyang
 * @2020/3/14 21:09
 */
public class LeetCode_300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        int result=1;
        int[] dp=new int[nums.length];
        dp[0]=1;
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            result=Math.max(result,dp[i]);
        }
        return result;

    }
}
