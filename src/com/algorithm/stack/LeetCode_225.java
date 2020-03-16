package com.algorithm.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhangluyang
 * @2020/3/1 20:38
 */
public class LeetCode_225 {
    Queue<Integer> q=new LinkedList();
    public LeetCode_225() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while(size > 1){
            q.add(q.remove());
            size--;
        }


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       return q.poll();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
