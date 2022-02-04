package com.algorithm.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2021/6/15 18:25
 */
public class LeetCode_852 {
    public int a=1;
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test(){
        int[] arr={3,4,5,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
