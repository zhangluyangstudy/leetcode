package com.algorithm.dp;

public class Leetcode122 {
    public int maxProfit(int[] prices) {
        int price=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                price=price+prices[i]-prices[i-1];
            }
        }
        return price;
    }
}
