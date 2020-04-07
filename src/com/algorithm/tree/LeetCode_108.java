package com.algorithm.tree;

/**
 * 将有序数组转换为二叉搜索树
 * @author zhangluyang
 * @2020/3/27 21:33
 */
public class LeetCode_108 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode sortedArrayToBST(int[] nums) {

        return r(0,nums.length-1,nums);
    }

    TreeNode r(int left,int right,int[] nums){
        if (left > right) {
            return null;
        }
        int p=(left+right)/2;
        if ((left + right) % 2 == 1) {
            p++;
        }
        TreeNode root=new TreeNode(nums[p]);
        root.left = r(left, p - 1,nums);
        root.right = r(p + 1, right,nums);
        return root;
    }

}
