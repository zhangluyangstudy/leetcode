package com.algorithm.linkedlist;

import org.junit.Test;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2020/3/19 15:51
 */
public class LeetCode_02 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean isTen=false;
        ListNode result=null;
        ListNode cur=null;
        while (l1!=null||l2!=null){
            int t1=l1==null?0:l1.val;
            int t2=l2==null?0:l2.val;
            int sum=t1+t2;
            if(isTen){
                sum+=1;
            }
            if(sum>=10){
                sum=sum-10;
                isTen=true;
            }else {
                isTen=false;
            }

            ListNode node=new ListNode(sum);
            if(result==null){
                result=node;
                cur=result;
            }else {
                cur.next=node;
                cur=cur.next;
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

        }

        if(isTen){
            ListNode node=new ListNode(1);
            cur.next=node;
        }
        return result;
    }

    @Test
    public void test1(){
        int[] arr1=new int[]{2,4,3};
        int[] arr2=new int[]{5,6,4};
        ListNode l1=null;
        ListNode ll1=null;
        for (int i:arr1){
            if(l1==null){
                l1=new ListNode(i);
                ll1=l1;
            }else {
                ll1.next=new ListNode(i);
                ll1=ll1.next;
            }
        }


        ListNode l2=null;
        ListNode ll2=null;
        for (int i:arr1){
            if(l2==null){
                l2=new ListNode(i);
                ll2=l2;
            }else {
                ll2.next=new ListNode(i);
                ll2=ll2.next;
            }
        }

        addTwoNumbers(l1,l2);
    }
}
