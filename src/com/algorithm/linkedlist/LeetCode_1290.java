package com.algorithm.linkedlist;

/**
 * @author zhangluyang
 * @2020/3/13 20:28
 */
public class LeetCode_1290 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public int getDecimalValue(ListNode head) {
        StringBuilder stringBuilder=new StringBuilder();
        while (head!=null){
            stringBuilder.append(head.val);
            head=head.next;
        }
        return Integer.parseInt(stringBuilder.toString(),2);
    }

}
