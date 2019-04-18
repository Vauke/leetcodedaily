package com.vauke.string.easy;

/**
 * No.917
 * Difficulty : Easy
 * Title      : Reverse Only Letters
 * url        : https://leetcode.com/problems/reverse-only-letters/
 *
 * Created by Vauke on 2019-04-18 21:10
 */
public class ReverseOnlyLetters {
    // one way
    public String reverseOnlyLetters(String s) {
        StringBuffer result = new StringBuffer();
        Stack letters = new Stack();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                letters.push(c);
            }
        }

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (!Character.isLetter(c)) {
                result.append(c);
            } else {
                result.append(letters.pop());
            }
        }

        return result.toString();
    }

    // another way
    public String reverseOnlyLetters(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0, len = s.length(), j = len - 1; i < len; i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                while (!Character.isLetter(s.charAt(j))) {
                    j--;
                }

                result.append(s.charAt(j--));
            } else {
                result.append(c);
            }

            return result.toString();
        }
    }
}
