package com.algorithm.arr;

import org.junit.Test;

public class LeetCode_922 {
    public int[] sortArrayByParityII(int[] A) {
        int[] arr=new int[A.length];
        int a=0;
        int b=1;
        for(int i:A){
           if(i%2==0){
               arr[a]=i;
               a+=2;
           }else{
               arr[b]=i;
               b+=2;
           }
        }
        return  arr;
    }

    @Test
    public  void test1(){
        int[] arr=new int[]{4,2,5,7};
        int[] ints = sortArrayByParityII(arr);
        for(int i:ints){
            System.out.println(i);
        }
    }




}
