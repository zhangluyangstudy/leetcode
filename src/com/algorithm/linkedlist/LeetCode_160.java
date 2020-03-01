package com.algorithm.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
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
        Map<ListNode,Integer> map=new HashMap<>();
        while (headA!=null){
            map.put(headA,1);
            headA=headA.next;
        }
        headB=headB.next;
        while (headB!=null){
            if(map.get(headB.val)!=null){
                return headB;
            }
            headB=headB.next;

        }
        return null;
    }
}
