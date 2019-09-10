package com.algorithm.stack;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2019/9/4 13:49
 */
public class LeetCode_1047 {
    public String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:chars){
            if(!stack.empty()&&c==stack.peek()){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        StringBuffer stringBuffer=new StringBuffer();

        while (!stack.empty()){
           stringBuffer.insert(0,stack.pop());
        }

        return stringBuffer.toString();

    }
}
