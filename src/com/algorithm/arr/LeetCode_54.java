package com.algorithm.arr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2021/3/15 20:17
 */
public class LeetCode_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int up=0;
        int down=m-1;
        int curRow=0;
        int curCol=0;
        //1 右2下3左4上
        int curposition=1;
        while (true){
            if(result.size()==m*n){
                break;
            }
            if(curposition==1){
                int temp=left;
                while (temp<=right){
                    result.add(matrix[curRow][temp]);
                    temp++;
                }
                curCol=right;
                curRow++;
                up++;
                curposition=2;
                continue;

            }
            if(curposition==2){
                int temp=curRow;
                while (temp<=down){
                    result.add(matrix[temp][curCol]);
                    temp++;
                }
                curRow=down;
                curCol=right-1;
                right--;
                curposition=3;
                continue;
            }
            if(curposition==3){
                int temp=curCol;
                while (temp>=left){
                    result.add(matrix[curRow][temp]);
                    temp--;
                }
                curRow=down-1;
                curCol=left;
                down--;
                curposition=4;
                continue;
            }
            if(curposition==4){
                int temp=curRow;
                while (temp>=up){
                    result.add(matrix[temp][curCol]);
                    temp--;
                }
                curRow=up;
                curCol=left+1;
                left++;
                curposition=1;
                continue;
            }
        }
        return result;
    }

    @Test
    public void test(){
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list = spiralOrder(matrix);
        list.forEach(r->{
            System.out.println(r);
        });

    }
}
