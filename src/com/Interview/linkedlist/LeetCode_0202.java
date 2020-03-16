package com.Interview.linkedlist;

/**
 * @author zhangluyang
 * @2020/3/16 17:14
 */
public class LeetCode_0202 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int kthToLast(ListNode head, int k) {
        ListNode temp=head;
        while (k>0){
            temp=temp.next;
            k--;
        }
        while (temp!=null){
            temp=temp.next;
            head=head.next;
        }
        return head.val;
    }
}
