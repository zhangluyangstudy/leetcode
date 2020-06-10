package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2020/4/29 20:37
 */
public class LeetCode_1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int[] row=new int[n];
        int[] col=new int[m];

        for(int i=0;i<indices.length;i++) {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }

        int ans=0;
        for(int i=0;i<n;i++)

            for(int j=0;j<m;j++) {
                if((row[i]+col[j])%2>0)
                    ans++;
            }
        return ans;
    }
}
