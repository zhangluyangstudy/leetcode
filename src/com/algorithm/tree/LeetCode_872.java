package com.algorithm.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2021/5/11 11:40
 */
public class LeetCode_872 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        pre(root1,l1);
        pre(root2,l2);
        if(l1.size()!=l2.size()){
            return false;
        }

        for (int i = 0; i <l1.size() ; i++) {
            if(l1.get(i)!=l2.get(i)){
                return false;
            }
        }
        return true;
    }

    private void pre(TreeNode treeNode, List<Integer> integerList){
        if(treeNode==null){
            return;
        }

        if(treeNode.left==null&&treeNode.right==null){
            integerList.add(treeNode.val);
        }

        pre(treeNode.left,integerList);
        pre(treeNode.right,integerList);
    }

    @Test
    public void test1(){
        TreeNode t1=new TreeNode(3);
        TreeNode t2=new TreeNode(5);
        TreeNode t3=new TreeNode(1);

        TreeNode t4=new TreeNode(6);
        TreeNode t5=new TreeNode(2);

        TreeNode t6=new TreeNode(9);
        TreeNode t7=new TreeNode(8);

        TreeNode t8=new TreeNode(7);
        TreeNode t9=new TreeNode(4);

        t1.left=t2;
        t1.right=t3;

        t2.left=t4;
        t2.right=t5;

        t3.left=t6;
        t3.right=t7;

        t5.left=t8;
        t5.right=t9;
        leafSimilar(t1,t2);



    }
}
