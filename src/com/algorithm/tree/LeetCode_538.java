package com.algorithm.tree;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/4/2 17:16
 */
public class LeetCode_538 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int temp=0;
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        count(root);
        helper(root);
        return root;
    }

    private void helper(TreeNode root) {
        if(root==null){
            return;
        }
        helper(root.left);
        temp+=root.val;
        root.val=root.val+sum-temp;
        helper(root.right);

    }

    private void count(TreeNode root) {
        if (root == null) {
            return;
        }
        sum+=root.val;
        count(root.left);
        count(root.right);
    }

    private void search(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        search(node.left);
        search(node.right);
    }


    @Test
    public void test(){
        TreeNode root=new TreeNode(5);
        TreeNode r1=new TreeNode(2);
        TreeNode r2=new TreeNode(13);
        root.left=r1;
        root.right=r2;
        convertBST(root);
    }
}
