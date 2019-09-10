package com.algorithm.tree;

import java.util.*;

/**
 * @author zhangluyang
 * @2019/8/24 20:16
 */
public class LeetCode_637 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Double sum=Double.valueOf(0);
            for(int i = 0; i< size; i++){
                TreeNode cur = queue.poll();
                sum=sum+Double.valueOf(cur.val);
                TreeNode left = cur.left;
                TreeNode right = cur.right;
                if(left!=null){
                    queue.add(left);
                }
                if(right!=null){
                    queue.add(right);
                }
            }

            Double i = sum /size;
            result.add(i);
        }
        return result;
    }
}
