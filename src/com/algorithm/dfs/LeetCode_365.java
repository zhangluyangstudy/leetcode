package com.algorithm.dfs;

/**
 * @author zhangluyang
 * @2020/3/21 21:45
 */
public class LeetCode_365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x==z||y==z||x+y==z){
            return true;
        }
        if(x+y<z){
            return false;
        }
        /**
         * 最大公约数
         */
        int big = Math.max(x, y);
        int small = x + y - big;
        if(small==0){
            return big==z;
        }
        while (big % small != 0) {
            int temp = small;
            small = big % small;
            big = temp;
        }
        return z % small == 0;

    }
}
