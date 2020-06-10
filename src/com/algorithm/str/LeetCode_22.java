package com.algorithm.str;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zhangluyang
 * @2020/4/9 11:21
 */
public class LeetCode_22 {
    private List<String> result = new ArrayList<>();
    private int n;

    public List<String> generateParenthesis(int n) {
        if(n<=0){
            return result;
        }
        this.n = n;
        StringBuffer stringBuffer = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        helper(0, 0, stringBuffer, stack);
        return result;
    }

    private void helper(int j, int k, StringBuffer stringBuffer, Stack<Character> stack) {
        if (j == n && k == n) {
            result.add(stringBuffer.toString());
            return;
        } else {
            if (stack.empty()) {
                Stack<Character> s = new Stack<>();
                s.push('(');
                j++;
                StringBuffer temp = new StringBuffer(stringBuffer);
                temp.append("(");
                helper(j++, k, temp, s);
            } else {
                if (j < n) {

                    int j1=j;
                    int k1=k;
                    int j2=j;
                    int k2=k;

                    Stack<Character> stack1 = new Stack<>();
                    stack1.addAll(stack);
                    stack1.push('(');
                    j1++;
                    StringBuffer s1 = new StringBuffer(stringBuffer);
                    s1.append("(");
                    helper(j1, k1, s1, stack1);

                    Stack<Character> stack2 = new Stack<>();
                    stack2.addAll(stack);
                    k2++;
                    StringBuffer s2 = new StringBuffer(stringBuffer);
                    s2.append(')');
                    if(stack2.peek()=='('){
                        stack2.pop();
                    }else {
                        stack2.push(')');
                    }
                    helper(j2,k2,s2,stack2);

                }else {
                    Stack<Character> stack2 = new Stack<>();
                    stack2.addAll(stack);
                    k++;
                    StringBuffer s2 = new StringBuffer(stringBuffer);
                    s2.append(')');
                    if(stack2.peek()=='('){
                        stack2.pop();
                    }else {
                        stack2.push(')');
                    }
                    helper(j,k,s2,stack2);
                }
            }
        }
    }

    public static void main(String[] args) {
        LeetCode_22 l=new LeetCode_22();
        l.generateParenthesis(1);
        List<String> result = l.result;
        for(String s:result){
            System.out.println(s);
        }
//        int j=0;
//        j++;
//        System.out.println(j);

    }
}
