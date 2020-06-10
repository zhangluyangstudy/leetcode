package com.algorithm.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2020/4/12 14:38
 */
public class LeetCode_64 {
    private int[][] gird;
    private int m;
    private int n;
    private List<String> list=new ArrayList<>();
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0&&j==0){
                    continue;
                }
                if(i==0){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }else if(j==0){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }else {
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }
            }
        }
        return dp[m-1][n-1];
    }

//    private void helper(int l, int k, String s) {
//        if (l==m-1&&k==n-1){
//            list.add(s+gird[l][k]);
//            return;
//        }
//        if(l<m-1){
//         helper(l+1,k,s+gird[l][k]+"----->");
//        }
//
//        if(k<n-1){
//            helper(l,k+1,s+gird[l][k]+"----->");
//        }
//
//
//
//    }
//
//    public static void main(String[] args) {
//        LeetCode_64 l=new LeetCode_64();
//
//        int[][] grid=new int[][]{
//                {1,3,1},
//                {1,5,1},
//                {4,2,1}
//        };
//        List<String> list = l.list;
//        l.minPathSum(grid);
//        for (String str:list) {
//            System.out.println(str);
//        }
//
////        System.out.println(l.minPathSum(grid));
//    }
}
