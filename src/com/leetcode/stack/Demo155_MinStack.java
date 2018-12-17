package com.leetcode.stack;

import java.util.Stack;

/**
 * @Author GentleNi
 * @Date 2018-12-17 19:25
 **/

/**
 * 牛逼啊
 */
public class Demo155_MinStack {

    private Stack<Integer> s = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public Demo155_MinStack() {

    }

    public void push(int x) {
        s.push(x);
        int minValue = minStack.isEmpty() ? x :
                Math.min(minStack.peek(), x);
        minStack.push(minValue);
    }

    public void pop() {
        s.pop();
        minStack.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
