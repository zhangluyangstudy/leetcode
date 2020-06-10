package com.algorithm.tree;

import org.junit.Test;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2020/4/7 20:08
 */
public class LeetCode_114 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

        public void flatten(TreeNode root) {
            if(root==null){
                return;
            }
            TreeNode left = root.left;
            TreeNode right= root.right;
            helper(left);
            helper(right);
            if(left!=null){
                if(right!=null){
                    TreeNode temp=left;
                    while (left.right!=null){
                        left=left.right;
                    }
                    left.right=right;
                    root.right=temp;
                }else {
                    root.right=left;

                }
                root.left=null;
            }
        }

        private void helper(TreeNode root){
            TreeNode cur=root;
            if(root!=null){
                if(root.left!=null){
                    TreeNode left = root.left;
                    TreeNode temp = root.left;
                    TreeNode right= root.right;
                    if(right==null){
                        root.right=left;
                    }else {
                        while (left.right!=null){
                            left=left.right;
                        }
                        left.right=right;
                        cur.right=temp;
                    }
                    cur.left=null;
                }
                helper(cur.right);
            }

        }

    @Test
    public void test(){
        TreeNode root=new TreeNode(1);
        TreeNode t1=new TreeNode(2);
        TreeNode t2=new TreeNode(5);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5 =new TreeNode(6);
        root.left=t1;
        root.right=t2;
        t1.left=t3;
        t1.right=t4;
        t2.right=t5;
        flatten(root);
        System.out.println(root);
//        System.out.println(zigzagLevelOrder(root));
    }







}
