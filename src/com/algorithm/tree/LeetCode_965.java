package com.algorithm.tree;

public class LeetCode_965 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return isUnivalTree(root,val);
    }

    public boolean isUnivalTree(TreeNode root,int val) {
        if(root==null){
            return true;
        }
        if(root.val!=val){
            return false;
        }
        return isUnivalTree(root.left,val)&&isUnivalTree(root.right,val);
    }



}
