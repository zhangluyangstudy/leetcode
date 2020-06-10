package com.Interview.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/4/8 8:57
 */
public class LeetCode_13 {
    public int movingCount1(int m, int n, int k) {
        if(k<=0){
            return 1;
        }
        int result=m*n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                int sum=0;
                sum+=getSum(i);
                sum+=getSum(j);
                if(sum>k){
                    result--;
                    System.out.print("\033[31m" + i+","+j+"    ");
                }else {
                    System.out.print("\033[30m"+i+","+j+"    ");
                }
            }
            System.out.println();
        }
        return result;
    }


    int m,n,k;
    public int movingCount(int m, int n, int k) {
        this.m=m;
        this.n=n;
        this.k=k;
        boolean[][] visited=new boolean[m][n];
        return dfs(0,0,0,visited);
    }

    /**
     * 深搜
     * @param i 横坐标
     * @param j 纵坐标
     * @param sum   坐标数位和
     * @param visited   标记数组
     * @return
     */
    private int dfs(int i, int j, int sum, boolean[][] visited) {
        //如果 坐标越界 或者 数位和大于k 或者 已经访问过，则停止当前方向的深搜
        if (i==m||j==n||sum>k||visited[i][j])return 0;
        //标记为已访问
        visited[i][j]=true;
        //向下或者向右深搜
        return 1+dfs(i+1,j,sums(i+1,j),visited)+dfs(i,j+1,sums(i,j+1),visited);
    }

    //计算数位和
    public int sums(int x,int y){
        int ans=0;
        while (x != 0) {
            ans+=x%10;
            x/=10;
        }
        while (y != 0) {
            ans+=y%10;
            y/=10;
        }
        return ans;
    }








    private int getSum(int i) {
       int sum=0;
       while (i>=10){
           sum+=i%10;
           i=i/10;
       }
       sum+=i;
       return sum;
    }

    @Test
    public void test(){
//        System.out.println("\033[31m" + "就是酱紫的");
        System.out.println(movingCount(16,8,4));
    }
}
