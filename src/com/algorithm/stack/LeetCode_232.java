package com.algorithm.stack;

import java.util.Stack;

/**
 * @author zhangluyang
 * @2019/9/6 14:02
 */
public class LeetCode_232 {
    /** Initialize your data structure here. */
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public LeetCode_232() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!s1.empty()){
            s2.push(s1.pop());
        }
        s2.push(x);
        while (!s2.empty()){
            s1.push(s2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s1.pop();
    }

    /** Get the front element. */
    public int peek() {
        return s1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }
}
