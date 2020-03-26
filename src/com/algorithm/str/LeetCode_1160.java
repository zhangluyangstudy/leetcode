package com.algorithm.str;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangluyang
 * @2020/3/17 21:39
 */
public class LeetCode_1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> mapSrc=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            if(mapSrc.get(chars.charAt(i))!=null){
                mapSrc.put(chars.charAt(i),mapSrc.get(chars.charAt(i))+1);
            }else {
                mapSrc.put(chars.charAt(i),1);
            }
        }
        int result=0;
        for(String str:words){
            boolean flag=true;
            char[] charArray = str.toCharArray();
            Map<Character,Integer> mapTemp=new HashMap<>();
            for(char c:charArray){
                if(mapTemp.get(c)!=null){
                    mapTemp.put(c,mapTemp.get(c)+1);
                }else {
                    mapTemp.put(c,1);
                }
            }

            for(Map.Entry<Character,Integer> entry:mapTemp.entrySet()){
                if(mapSrc.get(entry.getKey())==null||mapSrc.get(entry.getKey())<entry.getValue()){
                    flag=false;
                    break;
                }
            }

            if(flag){
                result+=str.length();
            }

        }
        return result;
    }

    @Test
    public void test1(){

        int atach = countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr");
        System.out.println(atach);
    }
}
