package com.algorithm.tree;

/**
 * @author zhangluyang
 * @2020/3/25 12:13
 */
public class LeetCode_671 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int result = -1;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null) {
            return -1;
        }
        int value = root.val;
        r(root.left,value);
        r(root.right,value);
        return result;
    }


    void r(TreeNode root,int val) {
        if(root==null){
            return;
        }
        if(root.val>val){
            if(result==-1||root.val<result){
                result=root.val;
            }
        }
        r(root.left,val);
        r(root.right,val);

    }
}
