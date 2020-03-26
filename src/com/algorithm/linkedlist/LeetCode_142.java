package com.algorithm.linkedlist;

/**
 * 环形链表
 *
 * @author zhangluyang
 * @2020/3/18 20:45
 */
public class LeetCode_142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while (true) {
            if (l2 == null || l2.next == null) {
                return null;
            }
            l1 = l1.next;
            l2 = l2.next.next;
            if (l1 == l2) {
                break;
            }
        }
        l2=head;
        while (l2 != l1) {
            l1 = l1.next;
            l2 = l2.next;
        }
        return l2;
    }

    public ListNode detectCycle1(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
