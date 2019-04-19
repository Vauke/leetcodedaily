package com.vauke.string.easy;

import java.util.Stack;

/**
 * No.344
 * Difficulty : Easy
 * Title      : Reverse String
 * url        : https://leetcode.com/problems/reverse-string/
 *
 * Created by Vauke on 2019-04-19 19:56
 */
public class ReverseString {

    // one way
    public void reverseString(char[] s) {
        Stack stack = new Stack();
        int length = s.length;
        for (int i = 0; i < length; i++) {
            stack.push(s[i]);
        }

        for (int i = 0; i < length; i++) {
            s[i] = (char)stack.pop();
        }
    }

    // another way
    public void reverseString1(char[] s) {
        int low = 0;
        int high = s.length - 1;

        while (low < high) {
            char temp = s[high];
            s[high] = s[low];
            s[low] = temp;

            low++;
            high--;
        }
    }
}
