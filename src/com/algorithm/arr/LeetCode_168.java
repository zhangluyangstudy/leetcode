package com.algorithm.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2021/6/29 10:44
 */
public class LeetCode_168 {
    public String convertToTitle(int columnNumber) {
        StringBuffer stringBuffer=new StringBuffer();
        while (columnNumber>26){
            int i=columnNumber%26;
            if(i==0){
                columnNumber/=27;
                i=26;
            }else {
                columnNumber/=26;
            }
            stringBuffer.append((char)(64+i));
        }
        stringBuffer.append((char)(64+columnNumber));
        return stringBuffer.reverse().toString();
    }

    @Test
    public void test1(){
        System.out.println(convertToTitle(703));
    }

    public static void main(String[] args) {
        int a=(int)'Z';
        char c=(char)90;
        System.out.println(a);
//        211---->128+8+1=137
        //129--->16--->2

//        System.out.println(676/26);
        //AA  AB AC /AD /AE ---/AZ
    }
}
