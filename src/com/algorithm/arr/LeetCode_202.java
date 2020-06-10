package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2020/4/30 10:09
 */
public class LeetCode_202 {
    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        while (n != 1) {
            int temp = 0;
            while (n >= 10) {
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            temp += (n % 10) * (n % 10);
            n = temp;
            if (n == 4) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(isHappy(15));
    }
}