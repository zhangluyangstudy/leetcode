package com.algorithm.tree;

/**
 * @author zhangluyang
 * @2020/4/10 18:58
 */
public class LeetCode_230 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    private int k;
    private int result;
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        return result;
    }

    void helper(TreeNode root){
        if(root==null){
            return;
        }
        k--;
        helper(root.left);
        if(k==0){
            result=root.val;
            return;
        }
        helper(root.left);
        helper(root.right);

    }

}
