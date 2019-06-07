package com.algorithm.sort;

import java.util.Arrays;

public class LeetCode_976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i=A.length-1;i>=2;i--){
            int a=A[i];
            int b=A[i-1];
            int c=A[i-2];
            if(a<b+c){
              return a+b+c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LeetCode_976 l=new LeetCode_976();
        int i = l.largestPerimeter(new int[]{1, 2, 2});
        System.out.println(i);

    }
}
