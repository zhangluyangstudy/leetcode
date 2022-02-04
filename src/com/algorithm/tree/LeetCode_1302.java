package com.algorithm.tree;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2021/6/9 16:07
 */
public class LeetCode_1302 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int result = 0;
    int maxLength=0;
    public int deepestLeavesSum(TreeNode root) {
        getMaxLength(root,0);
        r(root,0);
        return result;
    }

    private void getMaxLength(TreeNode root, int i) {
        if(root==null){
            return;
        }
        if(root.right==null&&root.left==null){
            maxLength=Math.max(maxLength,i+1);
        }
        getMaxLength(root.left,i+1);
        getMaxLength(root.right,i+1);

    }

    private void r(TreeNode root,int i) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if(i+1==maxLength){
                result = result + root.val;
            }
            return;
        }
        r(root.left,i+1);
        r(root.right,i+1);
    }

    @Test
    public void test() {

    }

}
