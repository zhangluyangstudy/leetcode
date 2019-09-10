package com.algorithm.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangluyang
 * @2019/8/29 15:07
 * leetcode 1122
 */
public class LeetCdoe_1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result=new int[arr1.length];

        Map<Integer,Integer> map=new HashMap<>();

        int count=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    count++;
                    map.put(arr2[i],map.get(arr2[i])==null?1:map.get(arr2[i])+1);
                }
            }
        }
        int index=0;
        for(int i=0;i<arr2.length;i++){
            Integer size = map.get(arr2[i]);
            while (size-->0){
                result[index++]=arr2[i];
            }
        }

        if(arr1.length>count){
            index=0;
            int[] noInArr=new int[arr1.length-count];
            for(int i=0;i<arr1.length;i++){
                if(map.get(arr1[i])==null){
                    noInArr[index++]=arr1[i];
                }
            }
            Arrays.sort(noInArr);

            for(int i=0;i<noInArr.length;i++){
                result[count++]=noInArr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2=new int[]{2,1,4,3,9,6};
        LeetCdoe_1122 l=new LeetCdoe_1122();
        int[] ints = l.relativeSortArray(arr1, arr2);

        for(int i:ints){
            System.out.println(i);
        }
        System.out.println(ints);

    }
}
