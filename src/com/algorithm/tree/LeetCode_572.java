package com.algorithm.tree;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/5/7 10:40
 */
public class LeetCode_572 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        if (s.val == t.val&&helper(s,t)) {
                return true;
        }else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }

    private boolean helper(TreeNode s, TreeNode t) {
        if (s == null && t != null) {
            return false;
        }

        if (s != null && t == null) {
            return false;
        }

        if (t == null) {
            return true;
        }
        if (s.val == t.val) {
            return helper(s.left, t.left) && helper(s.right, t.right);
        }
        return false;
    }

    @Test
    public void test() {
        //[3,4,5,1,2]
        //[4,1,2]
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(1);
//        TreeNode t2 = new TreeNode(5);
//        TreeNode t3 = new TreeNode(1);
//        TreeNode t4 = new TreeNode(2);

        root.left=t1;
//        root.right=t2;
//        t1.left=t3;
//        t1.right=t4;


        TreeNode t5 = new TreeNode(1);
//        TreeNode t6 = new TreeNode(1);
//        TreeNode t7 = new TreeNode(2);
//        t5.left = t6;
//        t5.right = t7;
        System.out.println(isSubtree(root,t5));
//        System.out.println(zigzagLevelOrder(root));
    }
}
