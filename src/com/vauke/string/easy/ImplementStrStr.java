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

        int hLen  = haystack.length();
        if (nLen > hLen) return -1;

        if (nLen == 1) return haystack.indexOf(needle.charAt(0));

        int index = -1;

        for (int i = 0, j = 0; i < nLen && j < hLen; i++, j++) {
            char nChar = needle.charAt(i);
            char hChar = haystack.charAt(j);

            index = j;
            while (nChar == hChar) {
                if (i < nLen - 1 && j < hLen - 1) {
                    nChar = needle.charAt(++i);
                    hChar = haystack.charAt(++j);

                    if (nChar == hChar && i == nLen - 1) return index;
                } else break;
            }

            i = -1;
            j = index;
        }

        return -1;
    }

    // another way
    public int strStr2(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen > hLen) return -1;
        if (nLen == 0) return 0;

        for (int i = 0; i < hLen - nLen + 1; i++) {
            if (needle.equals(haystack.substring(i, i + nLen))) return i;
        }

        return -1;
    }
}
