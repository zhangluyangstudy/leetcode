package com.algorithm.str;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/3/19 17:02
 */
public class LeetCode_409 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray()){
            count[c]++;
        }
        int result=0;
        for(int i:count){
            if(i%2==0){
                result+=i;
            }else {
                if(i>0){
                    result+=i-1;
                }
            }
        }


        return result==s.length()?result:result+1;

    }

    @Test
    public void test(){
        System.out.println(longestPalindrome("abccccdd"));
    }
}
