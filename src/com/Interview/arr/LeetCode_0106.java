package com.Interview.arr;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2020/3/16 20:50
 */
public class LeetCode_0106 {
    public String compressString(String S) {
        char[] chars = S.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(char c:chars){
            if(stack.empty()){
                stack.push(c);
            }else {
                if(!stack.peek().equals(c)){
                    stringBuilder.append(stack.pop());
                    stringBuilder.append(count);
                    stack.push(c);
                    count=1;
                    continue;
                }
            }

            count++;
        }
        if(!stack.empty()){
            stringBuilder.append(stack.pop());
            stringBuilder.append(count);
        }

        return S.length()>stringBuilder.length()?stringBuilder.toString():S;
    }
}
