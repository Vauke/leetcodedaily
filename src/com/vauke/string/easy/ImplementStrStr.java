package com.vauke.string.easy;

/**
 * No.28
 * Difficulty : Easy
 * Title      : Implement strStr()
 * url        : https://leetcode.com/problems/implement-strstr/
 *
 * Created by Vauke on 2019-04-26 23:00
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length();
        if (needle == null || nLen == 0) return 0;

        int hLen  = needle.length();
        int index = -1;

        for (int i = 0; i < hLen; i++) {
            char hChar = haystack.charAt(i);
            for (int j = index + 1; j < nLen; j++) {
                char nChar = needle.charAt(j);

                if (nChar == hChar) {
                    index = j;
                    break;
                }
            }
        }
    }
}
