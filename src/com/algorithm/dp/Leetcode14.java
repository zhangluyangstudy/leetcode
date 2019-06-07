package com.algorithm.dp;

import org.hamcrest.internal.ArrayIterator;
import org.junit.Test;

public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String first=strs[0];
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=0;i<first.toCharArray().length;i++){
            for (int j=1;j<strs.length;j++){
                char[] chars = strs[j].toCharArray();
                if(chars.length<=i||chars[i]!=first.charAt(i)){
                    return stringBuffer.toString();
                }

            }
            stringBuffer.append(first.charAt(i));
        }
        return stringBuffer.toString();
    }

    @Test
    public void test(){

        String s = longestCommonPrefix(new String[]{"f2lower", "flow", "flight"});
        System.out.println(s);
    }

    public String longestCommonPrefix1(String[] strs) {
        if(strs.length==0){
            return "";
        }
        Integer min=Integer.MAX_VALUE;
        for(String str:strs){
            min=Math.min(str.length(),min);
        }
        int low=0;
        int high=min;
        while (low<=high){
            int middle=(low+high)/2;
            if(isCommPre(strs,middle)){
                low=middle+1;
            }else {
                high=middle-1;
            }
        }
        return strs[0].substring(0,(low+high)/2);
    }

    private boolean isCommPre(String[] strs, int length) {
        String str1=strs[0].substring(0,length);
        for (int i=1;i<strs.length;i++){
            if(!strs[i].startsWith(str1)){
                return false;
            }
        }
        return true;
    }
}
