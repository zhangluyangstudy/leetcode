package com.Interview.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2021/6/23 10:26
 */
public class LeetCode_15 {
    public int hammingWeight(int n) {
        int result=0;
        while (n!=0){
            result+=n&1;
            n>>>=1;
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(hammingWeight(7));
    }
}
