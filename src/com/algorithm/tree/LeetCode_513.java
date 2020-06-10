package com.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhangluyang
 * @2020/4/10 14:45
 */
public class LeetCode_513 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            root = q.poll();
            if(root.right!=null) q.offer(root.right);
            if(root.left!=null) q.offer(root.left);
        }
        return root.val;
    }
}
