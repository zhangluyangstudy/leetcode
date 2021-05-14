package com.algorithm.arr;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author zhangluyang
 * @2020/11/2 19:00
 */
public class LeetCode_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<Integer>();
        for(int i:nums1){
            s1.add(i);
        }
        Set<Integer> s2=new HashSet<Integer>();
        for(int i:nums2){
            s2.add(i);
        }
        Set<Integer> result=new HashSet<>();
        if(s1.size()>s2.size()){
            compareList(s2,s1,result);
        }else{
            compareList(s1,s2,result);
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    private void compareList(Set<Integer> s1, Set<Integer> s2, Set<Integer> result) {
        s1.forEach(r->{
            if(!s2.add(r)){
                result.add(r);
            }
        });
    }
}
