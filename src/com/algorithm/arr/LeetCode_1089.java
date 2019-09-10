package com.algorithm.arr;

/**
 * @author zhangluyang
 * @2019/9/4 9:56
 */
public class LeetCode_1089 {

    /**
     * 网上优秀答案
     */
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0;
        while (j < n) {
            if (arr[i] == 0){
                ++j;
            }
            ++i;
            ++j;
        }
        --i;    // i 回到最后一次合法的位置
        --j;    // j 同理，但 j 仍可能等于 n（例如输入 [0]）
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                arr[--j] = arr[i];
            }
            --i;
            --j;
        }
    }

    public static void main(String[] args) {
        LeetCode_1089 l=new LeetCode_1089();
        int[] arr=new int[]{1,0,2,3,0,4,5,0};
        l.duplicateZeros(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
