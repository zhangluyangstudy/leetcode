package com.algorithm.tree;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangluyang
 * @2020/4/5 20:13
 */
public class LeetCode_106 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    private Map<Integer,Integer> map=new HashMap<>();
    private int[] postorder;
    private int[] inorder;
    private int post_index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder=postorder;
        this.inorder=inorder;
        post_index=inorder.length-1;
        for (int i = 0; i <inorder.length ; i++) {
            map.put(inorder[i],i);
        }
        return helper(0,postorder.length);
    }

    private TreeNode helper(int left, int right) {
        if(left>right){
            return null;
        }
        int val=postorder[post_index];
        int index = map.get(val);
        TreeNode root=new TreeNode(val);
        post_index--;
        root.left=helper(left,index);
        root.right=helper(index+1,right);
        return root;
    }

    @Test
    public void test(){
        int[] inorder={9,3,15,20,7};
        int[] postorder={9,15,7,20,3};
        buildTree(inorder,postorder);

    }
}
