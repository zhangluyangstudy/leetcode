package com.algorithm.arr;

import org.junit.Test;

public class LeetCode_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        for(int i=0;i<numbers.length;i++){
            result[0]=i+1;
            int j=i+1;
            while (j<numbers.length&&numbers[i]+numbers[j]<=target){
                if(numbers[i]+numbers[j]==target){
                    result[1]=j+1;
                    return result;
                }
                j++;
            }

        }
        return result;
    }
    public int[] twoSum1(int[] numbers, int target) {
        int[] result=new int[2];
        int i=0;
        int j=numbers.length-1;
        while (numbers[i]+numbers[j]!=target){
            if(numbers[i]+numbers[j]<target){
                i++;
            }else {
                j--;
            }
        }
        result[0]=i+1;
        result[1]=j+1;
        return result;
    }




    @Test
    public void test1(){
        int[] ints = twoSum1(new int[]{2, 7, 11, 15}, 9);
        for (int i:ints){
            System.out.println(i);
        }

    }
}
