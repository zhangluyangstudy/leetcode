package com.algorithm.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/5/9 17:45
 */
public class LeetCode_69 {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int i=1,j=x,ans=-1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                i= mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        return ans;
    }


    @Test
    public void test(){
        System.out.println(mySqrt(2147395599));
    }

}
