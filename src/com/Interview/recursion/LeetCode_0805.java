package com.Interview.recursion;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/7/2 13:40
 */
public class LeetCode_0805 {
    public int multiply(int A, int B) {

        if(A>B){
            return recursion(B,A);
        }else {
            return recursion(B,A);
        }


    }

    int recursion(int A, int B){
        if(A<=1){
            return B;
        }else {
            return B+recursion(A-1,B);
        }
    }


    @Test
    public void test(){
        System.out.println(multiply(918795921,1));
    }
}
