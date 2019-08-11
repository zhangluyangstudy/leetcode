package com.algorithm.tree;

import org.junit.Test;

/**
 * 求和
 */
public class LeetCode_938 {
      public TreeNode root;
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null){
            return 0;
        }
        if(root.val<L){
            return rangeSumBST(root.right,L,R);
        }
        if(root.val>R){
            return rangeSumBST(root.left,L,R);
        }
        return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
    }

    public void inTree(TreeNode root){
          if(root==null){
              return;
          }
        inTree(root.left);
        System.out.println(root.val);
        inTree(root.right);
    }

    @Test
    public void test(){
          TreeNode t1=new TreeNode(1);
          TreeNode t2=new TreeNode(2);
          TreeNode t3=new TreeNode(3);
          TreeNode t4=new TreeNode(4);
          TreeNode t5=new TreeNode(5);
          TreeNode t6=new TreeNode(6);
          TreeNode t7=new TreeNode(7);
          t2.left=t4;
          t2.right=t5;
          t3.left=t6;
          t3.right=t7;
          t1.left=t2;
          t1.right=t3;
          inTree(t1);
    }


    private int sum(TreeNode root, int l, int r) {
          if(root==null){
              return 0;
          }
          sum(root.left,l,r);
          if(root.val>=l&&root.val<=r){
             return root.val;
          }
          sum(root.right,l,r);
          return 0;
    }
    @Test
    public void test2(){
        int i = sum1(1);
        System.out.println(i);

    }
    public int sum1(int i){
        if(i>100){
            return 0;
        }
        return sum1(i+1)+i;
    }
}
