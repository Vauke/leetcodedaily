package com.vauke.string.easy;

/**
 * No.14
 * Difficulty : Easy
 * Title      : Longest Common Prefix
 * url        : https://leetcode.com/problems/longest-common-prefix/
 *
 * Created by Vauke on 2019-04-25 12:19
 */
public class LongestCommonPrefix {
    // approach 1
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";

        StringBuilder prefix = new StringBuilder();
        String shortest = strs[0];

        if (shortest.length() == 0) return "";
        char c = shortest.charAt(0);

        for (int i = 1; i < len; i++) {
            if (!strs[i].startsWith(String.valueOf(c))) return "";
            if (strs[i].length() < shortest.length()) shortest = strs[i];
        }

        prefix.append(c);

        int i = 1;
        int length = shortest.length();

        while (i < length) {
            prefix.append(shortest.charAt(i));

            for (int j = 0; j < len; j++) {
                if (!strs[j].startsWith(prefix.toString())) return prefix.deleteCharAt(i).toString();
            }
            i++;
        }
        return prefix.toString();
    }

    // approach 2
    public String longestCommonPrefix2(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        if (len == 1) return strs[0];
        StringBuilder prefix = new StringBuilder();
        int length = strs[0].length();
        boolean flag = true;

        for (int i = 1, j = 0; i < len; i++, j = 0) {
            while (j < length) {
                if (flag && i == 1) prefix.append(strs[0].charAt(j));

                if (strs[i].indexOf(prefix.toString()) != 0) {
                    prefix.deleteCharAt(prefix.length() - 1);
                    flag = false;
                    if (prefix.length() == 0) return "";
                }

                j++;
            }
        }

        return prefix.toString();
    }
}
