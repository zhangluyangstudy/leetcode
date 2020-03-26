package com.algorithm.tree;

/**
 * @author zhangluyang
 * @2020/3/22 17:41
 */
public class LeetCode_100 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val==q.val){
            return isSameTree(p.left,p.left)&&isSameTree(p.right,q.right);
        }
        return false;

    }
}
