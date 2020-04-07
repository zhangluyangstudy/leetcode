package com.Interview.arr;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/3/30 14:55
 */
public class LeetCode_62 {
    /**
     * 超出时间限制
     */
//    public int lastRemaining(int n, int m) {
//        int[] arr=new int[n];
//        int length=n;
//        int cur=0;
//        while (length>1){
//            int i=1;
//            while (i<=m-1){
//                cur=++cur%n;
//               if(arr[cur]==0){
//                   i++;
//               }
//
//            }
//            arr[cur]=1;
//            cur=++cur%n;
//            while (arr[cur]!=0){
//                cur=++cur%n;
//            }
//            length--;
//
//        }
//       for(int i=0;i<n;i++){
//           if(arr[i]==0){
//               return i;
//           }
//       }
//       return -1;
//    }

    public int lastRemaining(int n, int m) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (result + m) % i;
        }
        return result;
    }

   @Test
    public void test(){
        int[] arr=new int[]{0,1,2,3,4};
       System.out.println(lastRemaining(5,3));
   }
}
