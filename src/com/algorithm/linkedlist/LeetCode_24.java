package com.algorithm.linkedlist;

/**
 * 两两翻转链表
 * @author zhangluyang
 * @2020/3/18 21:44
 */
public class LeetCode_24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second = head.next;
        first.next=swapPairs(second.next);
        second.next=first;
        return second;
    }
}
