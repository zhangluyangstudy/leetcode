package com.algorithm.linkedlist;

/**
 * @author zhangluyang
 * @2020/3/19 14:26
 */
public class LeetCode_369 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode plusOne(ListNode head) {
        ListNode fast=head;
        ListNode slow=new ListNode(0);
        slow.next=head;
        while (fast!=null){
            if(fast.val!=9){
                slow=fast;
            }
            fast=fast.next;
        }
        slow.val=slow.val+1;
        ListNode cur=slow.next;
        while (cur!=null){
            cur.val+=0;
            cur=cur.next;
        }
        return slow.next == head ? slow : head;
    }
}
