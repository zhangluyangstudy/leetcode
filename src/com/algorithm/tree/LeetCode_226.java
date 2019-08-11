package com.algorithm.tree;

/**
 * 翻转二叉树
 */
public class LeetCode_226 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        invertTree(root);
        return root;
    }

    private void invert(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
    }
}
