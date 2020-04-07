package com.algorithm.str;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/4/1 17:28
 */
public class LeetCode_1111 {
    public int[] maxDepthAfterSplit(String seq) {
        int[] result=new int[seq.length()];
        char[] charArray = seq.toCharArray();
        int index=0;
        boolean flag=true;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='('){
                if(index%2==0){
                    result[i]=0;
                }else{
                    result[i]=1;
                }
                index++;
            }else {
                if(flag){
                    result[i]=0;
                    flag=false;
                }else {
                    result[i]=1;
                    flag=true;
                }
            }
        }

        return result;
    }

    @Test
    public void test(){
        String str="(()())";
        System.out.println(maxDepthAfterSplit(str));
    }
}
