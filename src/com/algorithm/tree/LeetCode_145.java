package com.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author zhangluyang
 * @2020/3/22 10:28
 */
public class LeetCode_145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.peek();
            if((curr.left == null && curr.right == null) ||
                    (pre != null && (pre == curr.left || pre == curr.right))){
                //如果当前结点左右子节点为空或上一个访问的结点为当前结点的子节点时，当前结点出栈
                res.add(curr.val);
                pre = curr;
                stack.pop();
            }else{
                if(curr.right != null) stack.push(curr.right); //先将右结点压栈
                if(curr.left != null) stack.push(curr.left);   //再将左结点入栈
            }
        }
        return null;
    }

    public List<Integer> postorderTraversal1(TreeNode root) {

        LinkedList<Integer> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode pop = stack.pop();
            list.addFirst(pop.val);
            if(pop.left!=null){
                stack.push(pop.left);
            }
            if(pop.right!=null){
                stack.push(pop.right);
            }
        }
        return list;
    }




}
