package com.algorithm.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * 相交链表
 * @author zhangluyang
 * @2019/10/11 15:28
 */
public class LeetCode_160 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA;
        ListNode B=headB;
        while (A!=B){
          if(A==null){
              A=headB;
          }else {
              A=A.next;
          }
            if(B==null){
                B=headA;
            }else {
                B=B.next;
            }
        }
        return A;
    }
}
