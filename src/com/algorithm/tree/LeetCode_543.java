package com.algorithm.tree;

/**
 * @author zhangluyang
 * @2020/3/10 20:17
 */
public class LeetCode_543 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    int result;
    public int diameterOfBinaryTree(TreeNode root) {
        result = 1;
        getDepth(root);
        return result - 1;
    }

    public int getDepth(TreeNode node) {
        if (node == null){
         return 0;
        }
        int L = getDepth(node.left);
        int R = getDepth(node.right);
        result = Math.max(result, L + R + 1);
        return Math.max(L, R) + 1;
    }
}
