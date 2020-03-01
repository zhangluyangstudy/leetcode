package com.algorithm.backtrack;

import java.util.List;

/**
 * @author zhangluyang
 * @2019/9/13 22:42
 */
public class LeetCode_784 {
    public List<String> letterCasePermutation(String S) {

    return null;

    }

    private char toUpper(char c){
        int i=(int)c-32;
        return (char)i;
    }

    public static void main(String[] args) {
        LeetCode_784 l=new LeetCode_784();
        char a = l.toUpper('a');
        System.out.println(a);

    }
}
