package com.algorithm.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangluyang
 * @2019/9/13 13:57
 */
public class LeetCode_17 {
    private static Map<Character,String> map=new HashMap<>();
    static {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        backTrack(0,result,digits,"");
        return result;
    }

    private void backTrack(int n,List<String> list,String digits,String str){
        if(n==digits.length()){
            list.add(str);
            return;
        }
        char c = digits.charAt(n);
        String s = map.get(c);
        for(int i=0;i<s.length();i++){
            str+=s.charAt(i);
            backTrack(n+1,list,digits,str);
            str=str.substring(0,str.length()-1);
        }
    }

    public static void main(String[] args) {
        LeetCode_17 l=new LeetCode_17();
        l.letterCombinations("23");
    }
}
