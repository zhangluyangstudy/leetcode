package com.algorithm.arr;

/**
 * 出现次数多的元素
 * @author zhangluyang
 * @2020/3/13 20:02
 */
public class LeetCode_169 {
    public int majorityElement(int[] nums) {
        int result=0;
        int count=0;
        for(int i:nums){
            if(count==0){
                result=i;
            }
            count=result==i?++count:--count;
        }
        return result;

    }
}
