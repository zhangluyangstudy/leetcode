package com.algorithm.tree;

/**
 * @author zhangluyang
 * @2020/4/14 14:03
 */
public class LeetCode_450 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if( root == null )
            return null;

        if( root.val >key ){
            root.left = deleteNode(root.left , key);
            return root;
        }
        else if(root.val<key ){
            root.right = deleteNode(root.right, key);
            return root;
        }
        else{   // e.compareTo(node.e) == 0

            // 待删除节点左子树为空的情况
            if(root.left == null){
                TreeNode rightNode = root.right;
                root.right = null;
                return rightNode;
            }

            // 待删除节点右子树为空的情况
            if(root.right == null){
                TreeNode leftNode = root.left;
                root.left = null;
                return leftNode;
            }

            // 待删除节点左右子树均不为空的情况

            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
            // 用这个节点顶替待删除节点的位置
            TreeNode successor = minimum(root.right);
            successor.right = removeMin(root.right);
            successor.left = root.left;
            root.left = root.right = null;
            return successor;
        }

    }

    private TreeNode minimum(TreeNode node){
        if(node.left == null)
            return node;
        return minimum(node.left);
    }



    private TreeNode removeMin(TreeNode node){
        if(node.left == null){
            TreeNode rightNode = node.right;
            node.right = null;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int result=0;
        while(i<j){
            result=Math.max((Math.min(height[i],height[j]))*(j-i),result);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return result;
    }

}
