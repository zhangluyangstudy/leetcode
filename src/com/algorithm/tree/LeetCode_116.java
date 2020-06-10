package com.algorithm.tree;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/4/10 16:10
 */
public class LeetCode_116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Node left = root.left;
        Node right = root.right;
        helper(left,right);
        return root;
    }

    private void helper(Node left, Node right) {
        if(left==null){
            return;
        }
        left.next=right;
        join(left,right);
        helper(left.left,left.right);
        helper(right.left,right.right);
    }

    void join(Node left,Node right){
        while (left.right!=null){
            left.right.next=right.left;
            left=left.right;
            right=right.left;
        }
    }



    @Test
    public void test(){
        //[-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13]
        Node root=new Node(-1);
        Node n1=new Node(0);
        Node n2=new Node(1);
        Node n3=new Node(2);
        Node n4=new Node(3);
        Node n5=new Node(4);
        Node n6=new Node(5);
        Node n7=new Node(6);
        Node n8=new Node(7);
        Node n9=new Node(8);
        Node n10=new Node(9);
        Node n11=new Node(10);
        Node n12=new Node(11);
        Node n13=new Node(12);
        Node n14=new Node(13);






    }




}
