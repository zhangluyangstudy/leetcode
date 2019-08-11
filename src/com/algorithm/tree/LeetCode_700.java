package com.algorithm.tree;

public class LeetCode_700 {
    public class TreeNode {
    int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val>val) {
            return searchBST(root.left, val);
        }
        if(root.val<val){
            return searchBST(root.right,val);
        }
        return root;

    }
}
