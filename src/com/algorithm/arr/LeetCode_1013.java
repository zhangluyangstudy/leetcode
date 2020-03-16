package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2020/3/11 20:48
 */
public class LeetCode_1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for(int i:A){
           sum+=i;
        }
        if(sum%3!=0){
            return false;
        }
        int result=sum/3;
        int i=0;
        int temp=0;
        while (i<A.length){
            temp+=A[i];
            i++;
            if(temp==result){
                break;
            }

        }
        if(i==A.length){
            return false;
        }
        temp=0;
        while (i<A.length){
            temp+=A[i];
            i++;
            if(temp==result){
                break;
            }

        }
        if(i==A.length){
            return false;
        }
        return true;
    }


}
