package com.algorithm.arr;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * @author zhangluyang
 * @2020/3/28 16:33
 */
public class LeetCode_820 {
    public int minimumLengthEncoding(String[] words) {
        if(words.length==1){
            return words[0].length()+1;
        }
        sortLength(words);
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(words[0]+"#");
        for(int i=1;i<words.length;i++){
            if(stringBuffer.indexOf(words[i]+"#")==-1){
                stringBuffer.append(words[i]+"#");
            }
        }
        return stringBuffer.length();
    }

    /**
     * 用set集合处理
     * @param words
     * @return
     */
    public int minimumLengthEncoding1(String[] words) {
        Set<String> stringSet=new HashSet<>(Arrays.asList(words));
        for (String word: words) {
            for (int k = 1; k < word.length(); ++k)
                stringSet.remove(word.substring(k));
        }
        int result = 0;
        for (String word: stringSet){
            result += word.length() + 1;
        }
        return 0;
    }




    private void sortLength(String[] words) {
        for(int i=0;i<words.length;i++){
            for (int j = 0; j < words.length; j++) {
                if(words[i].length()>words[j].length()){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("12#123123");
        int i = stringBuffer.indexOf("1234");
        System.out.println(i);
    }

    @Test
    public void test(){
        String[] words=new String[]{
                "time", "me", "bell"
        };
        sortLength(words);
        System.out.println(words);
    }

}
