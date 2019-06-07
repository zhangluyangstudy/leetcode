package com.algorithm.arr;

import org.junit.Test;

public class LeetcodeTwoEightThree {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int[] targetNmu=new int[length];
        int m=0;
        for(int i=0;i<length;i++){
            if(nums[i]!=0){
                targetNmu[m]=nums[i];
                m++;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int length = nums.length;
        int m=0;
        for(int i=0;i<length;i++){
            if(nums[i]!=0){
               nums[m]=nums[i];
               m++;
            }
        }

        for(int i=m;i<length;i++){
            nums[i]=0;
        }
    }



    @Test
    public  void  test1(){
        moveZeroes2(new int[]{0,0,1});
    }

}
