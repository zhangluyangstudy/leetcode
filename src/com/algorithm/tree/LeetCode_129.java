package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangluyang
 * @2020/4/6 17:09
 */
public class LeetCode_129 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private List<String> list = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        helper(root, stringBuffer);
        int sum=0;
        for (String str:list){
            sum+=Integer.valueOf(str);
        }
        return sum;
    }

    private void helper(TreeNode root, StringBuffer stringBuffer) {
        if (root.left != null || root.right != null) {
            stringBuffer.append(root.val);
            if (root.left != null) {
                StringBuffer left = new StringBuffer(stringBuffer);
                helper(root.left, left);
            }
            if (root.right != null) {
                StringBuffer right = new StringBuffer(stringBuffer);
                helper(root.right, right);
            }
        }else {
            stringBuffer.append(root.val);
            list.add(stringBuffer.toString());
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        TreeNode r1 = new TreeNode(9);
        TreeNode r2 = new TreeNode(0);
        TreeNode r3 = new TreeNode(5);
        TreeNode r4 = new TreeNode(1);
        root.left = r1;
        root.right = r2;
        r1.left=r3;
        r1.right=r4;
        LeetCode_129 l = new LeetCode_129();
        l.sumNumbers(root);
        System.out.println(l.list.size());

//
//        StringBuffer s1=new StringBuffer();
//        s1.append("1");
//        StringBuffer s2=new StringBuffer(s1);
//        s1.append("2");
//        System.out.println(s1);
//        System.out.println(s2);


    }


}
