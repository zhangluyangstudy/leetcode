package com.algorithm.tree;

import org.junit.Test;

/**
 * 验证二叉搜索树
 * @author zhangluyang
 * @2020/3/28 21:54
 */
public class LeetCode_98 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
//    public boolean isValidBST(TreeNode root) {
//        if(root==null){
//            return true;
//        }
//        if(root.left!=null){
//            if(root.left.val>=root.val){
//                return false;
//            }
//        }
//
//        if(root.right!=null){
//            if(root.right.val<=root.val){
//                return false;
//            }
//        }
//        return isValidBST(root.left)&&isValidBST(root.right);
//
//    }

    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (! helper(node.right, val, upper)) return false;
        if (! helper(node.left, lower, val)) return false;
        return true;
    }

    /**
     * 官方题解
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    @Test
    public void test(){
        TreeNode root=new TreeNode(10);
        TreeNode t1=new TreeNode(5);
        TreeNode t2=new TreeNode(15);
        TreeNode t3=new TreeNode(12);
        TreeNode t4=new TreeNode(20);
        TreeNode t5=new TreeNode(9);
        TreeNode t6=new TreeNode(13);
        TreeNode t7=new TreeNode(11);
        TreeNode t8=new TreeNode(21);
        root.left=t1;
        root.right=t2;
        t2.left=t3;
        t2.right=t4;
        t3.left=t5;
        t3.right=t6;
        t4.left=t7;
        t4.right=t8;
        System.out.println(isValidBST(root));
    }
}
