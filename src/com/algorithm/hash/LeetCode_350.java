package com.algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangluyang
 * @2019/9/10 10:10
 */
public class LeetCode_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            map.put(i,map.get(i)==null?1:map.get(i)+1);
        }
        List<Integer> list=new ArrayList<>();
        for (int i:nums2){
            Integer integer = map.get(i);
            if(integer!=null&&integer>0){
                map.put(i,integer-1);
                list.add(i);
            }

        }
        int[] result=new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }

        return result;
    }
}
