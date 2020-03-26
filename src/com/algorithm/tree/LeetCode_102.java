package com.algorithm.tree;

import java.util.*;

/**
 * @author zhangluyang
 * @2020/3/24 22:25
 */
public class LeetCode_102 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> s1=new LinkedList<>();
        Queue<TreeNode> s2=new LinkedList<>();
        s2.add(root);
        while (!s1.isEmpty()||!s2.isEmpty()){
            List<Integer> list=new ArrayList<>();
            if(!s1.isEmpty()){
                while (!s1.isEmpty()){
                    TreeNode treeNode = s1.poll();
                    list.add(treeNode.val);
                    if(treeNode.left!=null){
                        s2.add(treeNode.left);
                    }
                    if(treeNode.right!=null){
                        s2.add(treeNode.right);
                    }
                }
                result.add(list);
                continue;
            }

            if(!s2.isEmpty()){
                while (!s2.isEmpty()){
                    TreeNode treeNode = s2.poll();
                    list.add(treeNode.val);
                    if(treeNode.left!=null){
                        s1.add(treeNode.left);
                    }
                    if(treeNode.right!=null){
                        s1.add(treeNode.right);
                    }
                }
                result.add(list);
                continue;
            }

        }
        return result;
    }
}
