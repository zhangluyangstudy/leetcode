package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_590 {
    class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    private List<Integer> result=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        postAddOrder(root);
        return result;
    }

    void postAddOrder(Node root){
        if(root==null){
            return;
        }
        for(Node node:root.children){
            postAddOrder(node);
        }
        result.add(root.val);
    }

}
