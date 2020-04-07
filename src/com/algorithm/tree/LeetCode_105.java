package com.algorithm.tree;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author zhangluyang
 * @2020/4/3 23:07
 */
public class LeetCode_105 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    private Map<Integer,Integer> map=new HashMap<>();
    private int[] preorder;
    private int[] inorder;
    private int pre_index=0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        this.inorder=inorder;
        for (int i = 0; i <inorder.length ; i++) {
            map.put(inorder[i],i);
        }
        return helper(0,preorder.length);
    }

    private TreeNode helper(int left, int right) {
        if(left==right){
            return null;
        }
        int val=preorder[pre_index];
        int index = map.get(val);
        TreeNode root=new TreeNode(val);
        pre_index++;
        root.left=helper(left,index);
        root.right=helper(index+1,right);
        return root;
    }


}
