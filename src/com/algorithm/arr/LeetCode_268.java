package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2019/9/4 10:49
 */
public class LeetCode_268 {
    public int missingNumber(int[] nums) {
        int[] temp=new int[nums.length];

        for(int i:nums){
           if(i>=1){
            temp[--i]=1;
           }
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]==0){
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LeetCode_268 l=new LeetCode_268();
        int i = l.missingNumber(new int[]{3,0,1});
        System.out.println(i);
//            int i=1;
//        System.out.println(i--);

    }
}
