package com.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zhangluyang
 * @2020/4/8 14:32
 */
public class LeetCode_199 {
    public class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(root);
        while (!q1.isEmpty()||!q2.isEmpty()){
            if(!q1.isEmpty()){
                while (q1.size()>1){
                    TreeNode poll = q1.poll();
                    if(poll.left!=null){
                        q2.add(poll.left);
                    }
                    if(poll.right!=null){
                        q2.add(poll.right);
                    }
                }
                TreeNode poll = q1.poll();
                result.add(poll.val);
                if(poll.left!=null){
                    q2.add(poll.left);
                }
                if(poll.right!=null){
                    q2.add(poll.right);
                }
            }else {
                while (q2.size()>1){
                    TreeNode poll = q2.poll();
                    if(poll.left!=null){
                        q1.add(poll.left);
                    }
                    if(poll.right!=null){
                        q1.add(poll.right);
                    }
                }
                TreeNode poll = q2.poll();
                result.add(poll.val);
                if(poll.left!=null){
                    q1.add(poll.left);
                }
                if(poll.right!=null){
                    q1.add(poll.right);
                }
            }
        }
        return result;
    }
}
