package com.algorithm.tree;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2020/4/6 15:03
 */
public class LeetCode_173 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private TreeNode cur;
    public Stack<TreeNode> stack=new Stack<>();
    public LeetCode_173(TreeNode root) {
        cur=root;
        while (cur!=null){
            stack.push(cur);
            cur=cur.left;
        }
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode pop = stack.pop();
        TreeNode right = pop.right;
        while (right!=null){
            stack.push(right);
            right=right.left;
        }
        return pop.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();
    }
}
