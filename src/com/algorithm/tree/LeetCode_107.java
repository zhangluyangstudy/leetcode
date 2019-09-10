package com.algorithm.tree;

import java.util.*;

/**
 * @author zhangluyang
 * @2019/8/24 19:04
 */
public class LeetCode_107 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        Stack<List<Integer>> lists=new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i< size; i++){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                TreeNode left = cur.left;
                TreeNode right = cur.right;
                if(left!=null){
                    queue.add(left);
                }
                if(right!=null){
                    queue.add(right);
                }
            }
            lists.push(list);
        }

        while (!lists.empty()){
            result.add(lists.pop());
        }
        return result;
    }
}
