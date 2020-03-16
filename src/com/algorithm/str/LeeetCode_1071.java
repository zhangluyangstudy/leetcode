package com.algorithm.str;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/3/12 20:20
 */
public class LeeetCode_1071 {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.split(str2).length==0){
            return str2;
        }
        char[] chars = str2.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        int i=0;
        int max=0;
        for(char c:chars){
            i++;
            stringBuilder.append(c);
            if(str1.split(stringBuilder.toString()).length==0&&str2.split(stringBuilder.toString()).length==0){
               max=i;

            }
        }
        return str2.substring(0,max);
    }

    @Test
    public void test(){
//        String str1 = "ABABAB";
//        String str2 = "ABC";
//        String s = gcdOfStrings(str1, str2);
//        System.out.println(s);
//        String[] split = str1.split(str2);
//        System.out.println(split.length);
//        System.out.println(1);
        System.out.println(gcd(48,49));

    }

    private int gcd(int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }
}
