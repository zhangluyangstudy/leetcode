package com.algorithm.backtrack;

/**
 * @author zhangluyang
 * @2019/9/18 10:01
 */
public class LeetCode_79 {
    private int m;
    private int n;
    private int[][]arr={{0,1},{1,0},{-1,0},{0,-1}};
    private boolean[][] flag;
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        flag=new boolean[m][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(backTrack(i,j,word,board,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTrack(int i, int j, String word, char[][] board,int index) {
        if(index==word.length()-1){
            return word.charAt(index)==board[i][j];
        }
        if(board[i][j]==word.charAt(index)){
            flag[i][j]=true;
            for(int k=0;k<4;k++){
                int newX=i+arr[k][0];
                int newY=j+arr[k][1];
                if(inArea(newX,newY)&&!flag[newX][newX]){
                    if(backTrack(newX,newY,word,board,index+1)){
                        return true;
                    }
                }
            }
            flag[i][j]=false;
        }
        return false;
    }

    private boolean inArea(int x,int y){
        return x>=0&&x<m&&y>=0&&y<n;
    }

}
