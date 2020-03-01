package com.algorithm.recursion;

/**
 * @author zhangluyang
 * @2020/2/17 12:06
 */
public class LeetCode_1137 {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
          return 2;
        }
        int tmp=0,x=0,y=1,z=1;
        for(int i=3;i<=n;i++){
            tmp=x+y+z;
            x=y;
            y=z;
            z=tmp;
        }
        return z;
    }
}
