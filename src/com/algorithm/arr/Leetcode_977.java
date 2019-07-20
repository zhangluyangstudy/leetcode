package com.algorithm.arr;

import java.util.Arrays;

public class Leetcode_977 {
    public int[] sortedSquares(int[] A) {
    for(int i=0;i<A.length;i++){
        A[i]=A[i]*A[i];
    }
        Arrays.sort(A);
        return A;
    }

//    public:
//    int abs(int x){
//        return (x>=0)?x:(-x);
//    }

//    vector<int> sortedSquares(vector<int>& A) {
//        vector<int> ans(A.size());
//        int i=0, j=A.size()-1;
//        int index = j;
//        while (index>=0){
//            if (abs(A[i]) >= abs(A[j]) ){
//                ans[index] = A[i]*A[i];
//                i++;
//                index--;
//            }
//            else {
//                ans[index] = A[j]*A[j];
//                j--;
//                index--;
//            }
//        }
//        return ans;
//    }

}
