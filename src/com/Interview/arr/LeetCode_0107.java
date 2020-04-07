package com.Interview.arr;

/**
 * 旋转数组
 * @author zhangluyang
 * @2020/4/7 10:40
 */
public class LeetCode_0107 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp=new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                temp[i][j]=matrix[i][j];
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][n-j-1]=matrix[i][j];
            }
        }
    }
}
