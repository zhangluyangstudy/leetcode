package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2019/9/4 10:16
 */
public class LeetCode_985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result=new int[queries.length];
        int sum=0;
        for(int i:A){
           if(i%2==0){
               sum+=i;
           }
        }

        for(int i=0;i<queries.length;i++){
            int val=queries[i][0];
            int index=queries[i][1];
            int value=A[index];
            if((val+value)%2==0){
                if(value%2==0){
                    sum+=val;
                }else{
                    sum+=val+value;
                }
            }else{
                if(value%2==0){
                    result[i]=sum;
                }
            }
            result[i]=sum;
            A[index]=val+value;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode_985 l=new LeetCode_985();
//        int[] A=new int[]{1,2,3,4};
        int[] A=new int[]{3,2};
        int[][] queries ={
//                {1,0},
//                {-3,1},
//                {-4,0},
//                {2,3},
                {4,0},
                {3,0},

        };
        int[] ints = l.sumEvenAfterQueries(A, queries);
        for(int i:ints){
            System.out.println(i);
        }

    }
}
