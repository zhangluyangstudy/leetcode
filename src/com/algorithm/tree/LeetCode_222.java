package com.algorithm.tree;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/4/8 22:10
 */
public class LeetCode_222 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countLevel(root.left);
        int right = countLevel(root.right);
        if (left == right) {
            return (1 << left) + countNodes(root.right);
        } else {
            return (1 << right) + countNodes(root.left);
        }
    }

    public int countNodes1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countLevel(root.left);
        int right = countLevel(root.right);
        if (left == right) {
            return countNodes(root.right) + (1 << left);
        } else {
            return countNodes(root.left) + (1 << right);
        }
    }


    private int countLevel(TreeNode root) {
        int level = 0;
        while (root != null) {
            level++;
            root = root.left;
        }
        return level;
    }


    public static void main(String[] args) {
        System.out.println(1 << 3);
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        int i = countNodes(root);
        System.out.println(i);

    }


}
