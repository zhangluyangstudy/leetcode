package com.algorithm.stack;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2019/9/8 19:44
 */
public class LeetCode_844 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        char[] chars = S.toCharArray();
        for(char c:chars){
            if('#'==c){
              if(!s1.empty()){
                  s1.pop();
              }
            }else {
                s1.push(c);
            }
        }

        char[] chars1 = T.toCharArray();

        for(char c:chars1){
            if('#'==c){
                if(!s2.empty()){
                    s2.pop();
                }
            }else {
                s2.push(c);
            }
        }
        if(s1.size()!=s2.size()){
            return false;
        }
        while (!s1.empty()){
            if(s1.pop()!=s2.pop()){
                return false;
            }
        }
        return true;
    }
}
