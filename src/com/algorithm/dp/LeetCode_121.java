package com.algorithm.dp;

public class LeetCode_121 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(length<=1){
            return 0;
        }
        int num=0;
        for(int i=1;i<length;i++){
            for(int j=0;j<i;j++){
                num=Math.max(prices[i]-prices[j],num);
            }
        }
        return num;
    }


    public int maxProfit1(int[] prices) {
        int length = prices.length;
        if(length<=1){
            return 0;
        }
        int minNum=prices[0];
        int num=0;
        for(int i=1;i<length;i++){
            minNum=Math.min(minNum,prices[i]);
            num=Math.max(num,prices[i]-minNum);
        }
       return num;
    }

    public static void main(String[] args) {

    }
}
