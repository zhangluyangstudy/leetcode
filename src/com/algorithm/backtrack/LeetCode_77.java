package com.algorithm.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2019/9/13 18:55
 */
public class LeetCode_77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        backTrack(0,result,new ArrayList<>(),n,k);
        return result;
    }

    private void backTrack(int j,List<List<Integer>> result,List<Integer> list,int n,int k){
        if(list.size()==k){
           result.add(new ArrayList<>(list));
           return;
        }

        for(int i=j+1;i<=n;i++){
                list.add(i);
                backTrack(i,result,list,n,k);
                list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        LeetCode_77 l=new LeetCode_77();
        l.combine(3,2);
    }
}
