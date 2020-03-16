package com.algorithm.linkedlist;

/**
 * 翻转链表
 * @author zhangluyang
 * @2020/3/2 21:07
 */
public class LeetCode_206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 循环把前一个节点的next指向上一个节点
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode temp=cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
