package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2019/8/26 17:24
 * leetcode 1051. 高度检查器
 */
public class LeetCode_1051 {
    public int heightChecker(int[] heights) {
        int[] arr=new int[101];
        for(int height:heights){
            arr[height]++;
        }
        int count=0;
        for(int i=1,j=0;i<arr.length;i++){
            while(arr[i]-->0){
                if(heights[j++]!=i){
                    count++;
                }
            }
        }
      return count;
    }


    public static void main(String[] args) {
        LeetCode_1051 l=new LeetCode_1051();
        int i = l.heightChecker(new int[]{1, 1, 4, 2, 1, 3});
        System.out.println(i);
//        int i=0;
////        System.out.println(i++);
//        System.out.println(++i);
    }
}
