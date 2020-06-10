package com.algorithm.dp;

/**
 * @author zhangluyang
 * @2020/4/14 11:27
 */
public class LeetCode_413 {
    public int numberOfArithmeticSlices(int[] A) {
        int length = A.length;
        if(length<=2){
            return 0;
        }
        int result=0;
        for (int i = 2; i <length ; i++) {
            int temp=A[i]-A[i-1];
            int k=A[i-1];
            int count=1;
            for(int j=i-2;j>=0;j++){
                if(temp==k-A[j]){
                    count++;
                    if(count>=2){
                        result++;
                    }
                    k=A[j];
                }else {
                    break;
                }
            }
        }
        return result;
    }
}
