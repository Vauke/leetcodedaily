package com.vauke.string.easy;

import java.util.Stack;

/**
 * No.20
 * Difficulty : Easy
 * Title      : Valid Parentheses
 * url        : https://leetcode.com/problems/valid-parentheses/
 *
 * Created by Vauke on 2019-04-24 20:07
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        int len = s.length();
        
        if (len > 0 && len % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        String leftBrackets = "([{";
        String rightBrackets = ")]}";

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (leftBrackets.contains(Character.toString(c))) {
                stack.push(rightBrackets.charAt(leftBrackets.indexOf(c)));
            } else {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }

        return stack.isEmpty();
    }


    // same solution, different implementation
    public boolean isValid1(String s) {
        int len = s.length();
        if (len > 0 && len % 2 != 0) return false;

        Stack<Integer> stack = new Stack<>();

        String brackets = "()[]{}";

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int index = brackets.indexOf(c);
            if (index % 2 != 0) {
                if (stack.isEmpty() || stack.pop() != index) return false;
            } else {
                stack.push(index + 1);
            }
        }

        return stack.isEmpty();
    }
}
