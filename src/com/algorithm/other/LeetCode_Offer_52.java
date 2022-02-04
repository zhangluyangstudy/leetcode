package com.algorithm.other;

import com.algorithm.linkedlist.LeetCode_02;

/**
 * @author zhangluyang
 * @2021/7/21 18:54
 */
public class LeetCode_Offer_52 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;
        ListNode l2=headB;
        while (l1!=l2){
           l1=l1!=null?l1.next:headB;
           l2=l2!=null?l2.next:headA;

        }
        return l1;
    }
}
