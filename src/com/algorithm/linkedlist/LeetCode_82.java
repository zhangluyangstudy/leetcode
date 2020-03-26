package com.algorithm.linkedlist;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/3/19 21:38
 */
public class LeetCode_82 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode cur = node;
        boolean isRepeat = false;
        int value = 0;
        while (head.next != null) {
            if (isRepeat) {
                if (head.val == value) {

                } else {
                        if (head.next.val == head.val) {
                            isRepeat = true;
                            value = head.val;
                        } else {
                            cur.next =head;
                            cur=head;
                        }
                }
            } else {
                    if (head.next.val == head.val) {
                        isRepeat = true;
                        value = head.val;
                    } else {
                        cur.next =head;
                        cur=head;
                    }
            }
            head = head.next;

        }

        if (head.val==value) {
            cur.next = null;
        }else {
            cur.next=head;
        }
        return node.next;
    }

    @Test
    public void test() {
        int[] arr1 = new int[]{1,1,1,1,1};
        ListNode l1 = null;
        ListNode ll1 = null;
        for (int i : arr1) {
            if (l1 == null) {
                l1 = new ListNode(i);
                ll1 = l1;
            } else {
                ll1.next = new ListNode(i);
                ll1 = ll1.next;
            }
        }

        deleteDuplicates(l1);
    }
}
