package com.algorithm.tree;

/**
 * @author zhangluyang
 * @2020/3/22 11:11
 */
public class LeetCode_101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return r(root.left,root.right);
    }

    public boolean r(TreeNode t1,TreeNode t2) {
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }else {
            if(t1.val==t2.val){
                return r(t1.left,t2.right)&&r(t1.right,t2.left);
            }else {
                return false;
            }
        }

    }


}
