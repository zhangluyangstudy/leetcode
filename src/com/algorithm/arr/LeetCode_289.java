package com.algorithm.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/4/2 10:56
 */
public class LeetCode_289 {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] temp=new int[board.length][board[0].length];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                temp[i][j]=board[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                int size=getSize(i,j,temp);
                int value=temp[i][j];
                if(value==1){
                    if(size<2||size>3){
                        board[i][j]=0;
                    }
                }else {
                    if(size==3){
                        board[i][j]=1;
                    }
                }
            }
        }

    }

    private int getSize(int i, int j, int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int size=0;
        if(i-1>=0){
            if(board[i-1][j]==1){
                size++;
            }
            if(j-1>=0){
                if(board[i-1][j-1]==1){
                    size++;
                }
            }
            if(j+1<n){
                if(board[i-1][j+1]==1){
                    size++;
                }
            }
        }

        if(j-1>=0){
            if(board[i][j-1]==1){
                size++;
            }
            if(i+1<m){
                if(board[i+1][j-1]==1){
                    size++;
                }
            }
        }

        if(i+1<m){
            if(board[i+1][j]==1){
                size++;
            }
            if(j+1<n){
               if(board[i+1][j+1]==1){
                   size++;
               }
            }
        }

        if(j+1<n){
          if(board[i][j+1]==1){
              size++;
          }
        }
        return size;
    }

    @Test
    public void test(){
        int [][] board=new int[][]{
                {0,1,0},
                {0,0,1},
                    {1,1,1},
                        {0,0,0}
        };
        gameOfLife(board);
    }


}
