package com.algorithm.tree;

import java.util.List;

public class LeetCode_559 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    private int maxDepth=0;
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        getMaxDepth(root,0);
        return maxDepth;
    }

    private void getMaxDepth(Node root, int i) {
        if(root==null){
            return;
        }
        i++;
        maxDepth=maxDepth>i?maxDepth:i;
        for (Node node:root.children){
            getMaxDepth(node,i);
        }
    }
}
