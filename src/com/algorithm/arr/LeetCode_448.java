package com.algorithm.arr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]>0){
                nums[Math.abs(nums[i])-1]=0-nums[Math.abs(nums[i])-1];
            }
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }

    @Test
    public void test(){
        List<Integer> disappearedNumbers = findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(1);
        disappearedNumbers.forEach(r->{
            System.out.println(r);
        });
    }
}
