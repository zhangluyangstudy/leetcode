package com.algorithm.str;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author zhangluyang
 * @2021/7/30 15:29
 */
public class LeetCode_171 {
    public static int titleToNumber(String columnTitle) {
        char[] charArray = columnTitle.toCharArray();
        int result=0;
        int pre=1;
        for (int i = charArray.length-1; i >=0; i--) {
            result+=((int)charArray[i]-64)*pre;
            pre*=26;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println((int)'A');
        System.out.println(titleToNumber("ZY"));
    }
}
