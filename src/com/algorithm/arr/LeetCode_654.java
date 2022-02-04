package com.algorithm.arr;

import org.junit.Test;


/**
 * @author zhangluyang
 * @2021/7/5 14:18
 */
public class LeetCode_654 {
    public int[] findErrorNums(int[] nums) {
        int[] result=new int[2];
        int[] temp=new int[nums.length+1];
        for (int i=0;i<nums.length;i++){
            temp[nums[i]]=temp[nums[i]]+1;
        }
        for (int i = 1; i < temp.length ; i++) {
            if(temp[i]==0){
                result[1]=i;
                continue;
            }
            if(temp[i]==2){
                result[0]=i;
                continue;
            }
        }
        return result;
    }

    @Test
    public void test(){
        int[] nums={1,2,4,4,5};
        int[] errorNums = findErrorNums(nums);
        System.out.println(errorNums[0]+"------"+errorNums[1]);

    }
}
