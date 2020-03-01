package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2020/2/29 21:40
 */
public class LeetCode_1295 {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int num:nums){
            if(isDouble(num)){
                result++;
            }
        }
        return result;
    }

    boolean isDouble(int num){
        int i=1;
        while(num/10>10){
            i++;
            num=num%10;
        }
        return i%2==0;
    }
}
