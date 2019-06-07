package com.nk;

import org.junit.Assert;

public class NumberOf1 {
    public int numberOf1(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int count='0';
        for(char c:chars){
            if(c=='1'){
                count++;
            }
        }
        return count;


    }
}
