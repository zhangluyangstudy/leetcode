package com.algorithm.arr;

import java.util.*;

/**
 * @author zhangluyang
 * @2020/3/27 20:06
 */
public class LeetCode_914 {
    public boolean hasGroupsSizeX(int[] deck) {
        int length = deck.length;
        if(length==1){
            return false;
        }
        if(length==2){
            return deck[0]==deck[1];
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:deck){
            if(map.get(i)==null){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }
        List<Integer> list=new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           if(entry.getValue()==1){
               return false;
           }
           list.add(entry.getValue());
       }
       int gcd=list.get(0);
       for (Integer i:list){
          gcd=gcd(i,gcd);
          if(gcd==1){
              return false;
          }

       }
        return true;
    }

    private int gcd(int max,int min){
        if(max%min==0){
            return min;
        }
        return gcd(min,max%min);


    }
}
