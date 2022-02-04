package com.algorithm.linkedlist;

/**
 * @author zhangluyang
 * @2021/6/28 15:22
 */
public class LeetCode_92 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //1->2->3->4->5
        //1->3->2->4->5
        //1->4->3->2->5
        if(left==right){
            return head;
        }
        int i=1;
        ListNode cur=head;
        ListNode l1=head;
        ListNode l2=head;
        while (head!=null){
            
        }


        return null;
    }


}
