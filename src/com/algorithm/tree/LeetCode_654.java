package com.algorithm.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangluyang
 * @2020/4/9 18:53
 */
public class LeetCode_654 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int[] nums;
    private Map<Integer,Integer> indexMap=new HashMap<>();
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums=nums;
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i],i);
        }
        return helper(0,nums.length-1);
    }

    private TreeNode helper(int left, int right) {
        if(right<left){
            return null;
        }
        int max = getMax(left, right);
        TreeNode root=new TreeNode(max);
        Integer index = indexMap.get(max);
        root.left=helper(left,index-1);
        root.right=helper(index+1,right);
        return root;
    }

    private int getMax(int left,int right){
        int max=Integer.MIN_VALUE;
        for(int i=left;i<=right;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        LeetCode_654 l=new LeetCode_654();
//        int[] nums={3,2,1,6,0,5};
        int[] nums={1};
        TreeNode treeNode = l.constructMaximumBinaryTree(nums);
        System.out.println(treeNode);
    }


    public String reverseWords(String s) {
        if(s.length()<=1){
            return s;
        }
        String[] ss = s.split(" ");
        int n = ss.length;
        StringBuilder ans = new StringBuilder();
        for (int i = n - 1;i >= 0;i--){
            if (ss[i].length() == 0) continue;
            ans.append(ss[i]).append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }



}
