package com.algorithm.linkedlist;

import org.junit.Test;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2020/4/14 9:07
 */
public class LeetCode_445 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while (l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        ListNode root=null;
        boolean isTen=false;
        while (!s1.empty()||!s2.empty()){
            int val=0;
            if(!s1.empty()){
                val+=s1.pop();
            }
            if(!s2.empty()){
                val+=s2.pop();
            }
            if(isTen){
                val++;
            }
            ListNode listNode=null;
            if(val>=10){
                val=val-10;
                isTen=true;
            }else {
                isTen=false;
            }
            listNode=new ListNode(val);
            if(root==null){
                root=listNode;
            }else {
                listNode.next=root;
                root=listNode;
            }
        }

        if(isTen){
            ListNode listNode=new ListNode(1);
            listNode.next=root;
            root=listNode;
        }
        return root;
    }

    @Test
    public void test(){
        //(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
        ListNode l1=new ListNode(7);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(4);
        ListNode l4=new ListNode(3);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;


        ListNode l5=new ListNode(5);
        ListNode l6=new ListNode(6);
        ListNode l7=new ListNode(4);

        l5.next=l6;
        l6.next=l7;
        ListNode listNode = addTwoNumbers(l1, l5);
        System.out.println(listNode);


    }
}
