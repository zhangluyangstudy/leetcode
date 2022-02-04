package com.algorithm.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2021/5/31 16:47
 */
public class LeetCode_342 {
    public boolean isPowerOfFour(int n) {
        if(n==1||n==4){
            return true;
        }
        if(n<4||n%4!=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }

    @Test
    public void test1(){
        boolean powerOfFour = isPowerOfFour(100);
        System.out.println(powerOfFour);


    }
}
