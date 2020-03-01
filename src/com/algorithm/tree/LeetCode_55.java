package com.algorithm.tree;

/**
 * @author zhangluyang
 * @2020/2/29 15:37
 */
public class LeetCode_55 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

}
