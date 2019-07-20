package com.algorithm.str;

/**
 * leetcode 125. 验证回文串
 * 思路
 * 从头到尾  依次比较
 */
public class LeetCode_125 {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j){
            while (i<j&&!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while (i<j&&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}