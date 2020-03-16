package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2020/3/5 20:31
 */
public class LeetCode_1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result=new int[num_people];
        int need=1;
        while (true){
            int i=(need-1)%num_people;
            if(candies<=need){
                result[i]= result[i]+candies;
                return result;
            }else {
                result[i]=result[i]+need;
                candies=candies-need;
            }
            need++;
        }
    }

    public int pivotIndex(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        int pre=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(pre==sum-nums[i]-pre){
                return i;
            }
            pre=pre+nums[i];
        }
        return -1;

    }
}
