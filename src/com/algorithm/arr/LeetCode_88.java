package com.algorithm.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/3/3 16:54
 */
public class LeetCode_88 {
    public void merge(int[] A, int m, int[] B, int n) {
        int[] temp=new int[m+n];
        int j=0,k=0;
        for(int i=0;i<temp.length;i++){
            if(k>=n||(A[j]<B[k]&&j<m)){
                temp[i]=A[j];
                j++;
            }else {
                temp[i]=B[k];
                k++;
            }
        }

        for(int i=0;i<temp.length;i++){
           A[i]=temp[i];
        }
    }

    @Test
    public void test1(){
        int[] A={2,0};
        int[] B={1};
        merge(A,1,B,1);
    }

}
