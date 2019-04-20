package com.vauke.string.easy;

/**
 * No.557
 * Difficulty : Easy
 * Title      : Reverse Words in a String III
 * url        : https://leetcode.com/problems/reverse-words-in-a-string-iii/
 *
 * Created by Vauke on 2019-04-20 15:51
 */
public class ReverseWordsInaStringIII {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;

        char[] c = s.toCharArray();
        char temp;

        for (int i = 0, len = c.length; i < len; i++) {
            if (Character.isSpaceChar(c[i]) || i == len - 1) {
                if (i > 0) {
                    if (i == len - 1) {
                        end = i;
                    } else {
                        end = i - 1;
                    }

                    while (end > start) {
                        temp = c[end];
                        c[end] = c[start];
                        c[start] = temp;
                        end--;
                        start++;
                    }

                    start = i + 1;
                }
            }
        }

        // return new String(c);
        return String.valueOf(c);
    }
}
