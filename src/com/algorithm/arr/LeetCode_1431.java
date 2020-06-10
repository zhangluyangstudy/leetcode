package com.algorithm.arr;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2020/6/1 18:48
 */
public class LeetCode_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i:candies){
            if(i>max){
                max=i;
            }
        }
        List<Boolean> result=new ArrayList<>();
        for(int i:candies){
            if(extraCandies+i>=max){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
}
