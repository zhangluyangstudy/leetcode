package com.algorithm.arr;

import org.junit.Test;

public class LeetcodeFiveZeroNine {
    public int fib(int N) {
        if (0==N){
            return 0;
        }
        if (1==N){
            return 1;
        }
        int des=0;
        int[] dp=new int[N+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=N;i++){
            dp[i]=dp[i-1]+dp[i-2];
            des=dp[i];
        }
        return  des;
    }

    @Test
    public  void  test1(){
        fib(2);
    }

}
