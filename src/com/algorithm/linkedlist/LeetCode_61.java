package com.algorithm.linkedlist;

/**
 * 旋转链表
 * @author zhangluyang
 * @2020/3/20 9:25
 */
public class LeetCode_61 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode l1=head;
        int length=0;
        while (l1!=null){
            l1=l1.next;
            length++;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (k > 0) {
            fast=fast.next;
            k--;
        }

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode node=slow.next;
        fast.next=null;
        slow.next=head;

       return node;
    }
}
