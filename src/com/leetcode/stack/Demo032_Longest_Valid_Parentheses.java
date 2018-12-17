package com.leetcode.stack;

import java.util.Stack;

/**
 * @Author GentleNi
 * @Date 2018-12-17 20:37
 **/

public class Demo032_Longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int longest = 0;
        int start = -1;//longest的起点
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {//说明现在栈里没有数据，要重置longest的起始点
                    start = i;
                } else {//配对
                    stack.pop();
                    if (stack.isEmpty()) {
                        longest = Math.max(longest,i - start);
                    } else {
                        longest = Math.max(longest,i - stack.peek());//i减去左括号栈顶的位置，比如((()就是3-1 = 2
                    }
                }
            }
        }

        return longest;
    }
}
