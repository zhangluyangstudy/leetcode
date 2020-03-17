package com.algorithm.linkedlist;

/**
 * @author zhangluyang
 * @2020/3/17 10:11
 */
public class LeetCode_19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode l1=head;
        ListNode l2=head;
        while (n>0){
            l1=l1.next;
            n--;
        }
        if(l1==null){
            return head.next;
        }
        while (l1.next!=null){
            l1=l1.next;
            l2=l2.next;
        }
        l2.next=l2.next.next;
        return head;
    }
}
