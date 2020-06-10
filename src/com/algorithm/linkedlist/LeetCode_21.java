package com.algorithm.linkedlist;

import org.junit.Test;

/**
 * @author zhangluyang
 * @2020/5/1 15:35
 */
public class LeetCode_21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null||l2==null){
           if(l1==null){
               return l2;
           }
           if(l2==null){
               return l1;
           }
        }

        ListNode head;
        if(l1.val<=l2.val){
            head=new ListNode(l1.val);
            l1=l1.next;
        }else {
            head=new ListNode(l2.val);
            l2=l2.next;
        }
        ListNode temp=head;
        while (l1!=null||l2!=null){
            if(l1==null){
              temp.next=new ListNode(l2.val);
              temp=temp.next;
              l2=l2.next;
              continue;
            }
            if(l2==null){
                temp.next=new ListNode(l1.val);
                temp=temp.next;
                l1=l1.next;
                continue;
            }
            if(l1.val<=l2.val){
                temp.next=new ListNode(l1.val);
                temp=temp.next;
                l1=l1.next;
            }else {
                temp.next=new ListNode(l2.val);
                temp=temp.next;
                l2=l2.next;
            }
        }
        return head;
    }


    @Test
    public void test(){
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(4);

        l1.next=l2;
        l2.next=l3;

        ListNode l4=new ListNode(1);
        ListNode l5=new ListNode(3);
        ListNode l6=new ListNode(4);

        l4.next=l5;
        l5.next=l6;

        mergeTwoLists(l1,l4);
    }
}
