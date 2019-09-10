package com.algorithm.hash;


import java.util.HashMap;
import java.util.Map;

public class LeetCode_387 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.get(s.charAt(i))==null?1:map.get(s.charAt(i))+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }
}
