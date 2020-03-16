package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2020/3/11 10:52
 */
public class LeetCode_209 {
    public int minSubArrayLen(int s, int[] nums) {
        int l=0;
        int r=-1;
        int sum=0;
        int result=nums.length+1;
        while (l<nums.length){
            if(r+1<nums.length&&sum<s){
                sum+=nums[++r];
            }else {
                sum-=nums[l++];
            }
            if(sum>=s){
                result=Math.min(result,r-l+1);
            }
        }
        if(result==nums.length+1){
            return 0;
        }
        return result;
    }
}
