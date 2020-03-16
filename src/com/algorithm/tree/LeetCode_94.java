package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zhangluyang
 * 二叉树非递归遍历
 * @2020/3/12 16:14
 */
public class LeetCode_94 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        while(root!=null||!stack.empty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            result.add(root.val);
            root=root.right;
        }
        return result;
    }
}
