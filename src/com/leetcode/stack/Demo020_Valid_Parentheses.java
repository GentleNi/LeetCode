package com.leetcode.stack;

import java.util.Stack;

/**
 * @Author GentleNi
 * @Date 2018-12-17 19:56
 **/

public class Demo020_Valid_Parentheses {
    public boolean isValid(String s) {
        if (s == null)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && match(stack.peek(),c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    boolean match(char ch1, char ch2) {
        return (ch1 == '(' && ch2 == ')') ||
                (ch1 == '[' && ch2 == ']') ||
                (ch1 == '{' && ch2 == '}');
    }

}
