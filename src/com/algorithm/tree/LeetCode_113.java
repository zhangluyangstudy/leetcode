package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2020/4/7 14:18
 */
public class LeetCode_113 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        helper(root, sum, list, temp);
        return result;
    }

    private void helper(TreeNode root, int sum, List<Integer> list, int temp) {
        if (root.left != null || root.right != null) {
            int val = root.val;
            if (root.left != null) {
                List<Integer> left = new ArrayList<>(list);
                left.add(val);
                helper(root.left, sum, left, temp + val);
            }
            if (root.right != null) {
                List<Integer> right = new ArrayList<>(list);
                right.add(val);
                helper(root.right, sum, right, temp + val);
            }
        } else {
            if (temp + root.val == sum) {
                list.add(root.val);
                result.add(list);
            }
        }
    }

}
