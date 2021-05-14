package com.algorithm.str;

import org.junit.Test;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2021/3/11 15:00
 */
public class LeetCode_227 {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int num=0;
        char preop='+';
        int length = s.toCharArray().length;
        for(int i = 0; i< length; i++){
            if(Character.isDigit(s.charAt(i))){
                num=num*10+s.charAt(i)-'0';
            }
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i ==  length- 1){
              switch (preop){
                  case '+':
                      stack.push(num);
                      break;
                  case '-':
                      stack.push(-num);
                      break;
                  case '*':
                      stack.push(stack.pop()*num);
                      break;
                  case '/':
                      stack.push(stack.pop()/num);
                      break;

              }
              preop=s.charAt(i);
              num=0;
            }
        }
        int result=0;
        while (!stack.empty()){
            result+=stack.pop();
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(calculate("3+2*2"));
    }
}
