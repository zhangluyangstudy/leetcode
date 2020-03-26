package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的前序遍历
 * 非递归
 *
 * @author zhangluyang
 * @2020/3/12 16:39
 */
public class LeetCode_144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return null;
        }
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode pop = stack.pop();
            result.add(pop.val);
            if(pop.right!=null){
                stack.push(pop.right);
            }
            if(pop.left!=null){
                stack.push(pop.left);
            }

        }
        return result;
    }


    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        r(root,result);
        return null;
    }

    private void r(TreeNode root, List<Integer> result) {
        if(root==null){
            return;
        }
        result.add(root.val);
        r(root.left,result);
        r(root.right,result);
    }

}
