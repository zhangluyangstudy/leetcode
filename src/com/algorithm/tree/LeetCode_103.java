package com.algorithm.tree;

import org.junit.Test;

import java.util.*;

/**
 * @author zhangluyang
 * @2020/4/4 21:01
 */
public class LeetCode_103 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(root);
        boolean flag=true;
        while (!q1.isEmpty()||!q2.isEmpty()){

            if(flag){
                List<Integer> list=new ArrayList<>();
               while (!q1.isEmpty()){
                   TreeNode poll = q1.poll();
                   list.add(poll.val);
                   if(poll.left!=null){
                       q2.add(poll.left);
                   }
                   if(poll.right!=null){
                       q2.add(poll.right);
                   }
               }
                result.add(list);
            }else{
                LinkedList<Integer> list=new LinkedList<>();
                while (!q2.isEmpty()){
                    TreeNode poll = q2.poll();
                    list.addFirst(poll.val);
                    if(poll.left!=null){
                        q1.add(poll.left);
                    }
                    if(poll.right!=null){
                        q1.add(poll.right);
                    }
                }
                result.add(list);
            }
            flag=!flag;
        }
        return result;
    }

    @Test
    public void test(){
        Stack<Integer> stack=new Stack<>();
        stack.push(null);
        System.out.println(stack.size());
//        TreeNode root=new TreeNode(3);
//        TreeNode t1=new TreeNode(9);
//        TreeNode t2=new TreeNode(20);
//        TreeNode t3=new TreeNode(15);
//        TreeNode t4=new TreeNode(7);
//        root.left=t1;
//        root.right=t2;
//        t2.left=t3;
//        t2.right=t4;
//        System.out.println(zigzagLevelOrder(root));
    }
}
