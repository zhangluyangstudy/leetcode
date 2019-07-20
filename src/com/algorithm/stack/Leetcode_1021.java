package com.algorithm.stack;

import org.junit.Test;

import java.util.Stack;

/**
 *  删除最外层的括号
 */
public class Leetcode_1021 {
    public String removeOuterParentheses(String S) {
        char[] chars = S.toCharArray();
        Stack<Character> s=new Stack<Character>();
        s.push('(');
        String result="";
        String temp="";
        for(int i=1;i<chars.length;i++){
            if(')'==chars[i]){
                Character pop = s.pop();
                if(!s.empty()){
                    temp+=")";
                }else{
//                    if(!"".equals(temp)){
//                        temp+=")";
//                    }
                    result+=temp;
                    temp="";
                }
            }else{
                if(!s.empty()){
                    temp+=chars[i];
                }
                s.push(chars[i]);

            }
        }
//        for(char c:chars){
//            System.out.println(c);
//        }

        return result;
    }

    /***
     * 网上优秀答案
     * @param S
     * @return
     */
    public String removeOuterParentheses1(String S) {
        StringBuilder builder = new StringBuilder();
        int start = 0;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if ('(' == S.charAt(i)) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                //获取到一组原语
                builder.append(S, start+1, i);
                start = i+1;
            }
        }

        return builder.toString();


    }


    @Test
    public void test(){
        String s = removeOuterParentheses("(()())(())(()(()))");
        System.out.println(s);
    }
}
