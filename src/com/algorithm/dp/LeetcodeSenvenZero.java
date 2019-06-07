package com.algorithm.dp;

public class LeetcodeSenvenZero {

    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return  climbStairs(n-1)+climbStairs(n-2);
    }

    public int climbStairs2(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        int des=0;
        for (int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
            des=dp[i];
        }
        return  des;

    }
}
