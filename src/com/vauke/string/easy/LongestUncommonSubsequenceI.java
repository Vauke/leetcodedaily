package com.vauke.string.easy;

/**
 * No.521
 * Difficulty : Easy
 * Title      : Longest Uncommon Subsequence I
 * url        : https://leetcode.com/problems/longest-uncommon-subsequence-i/
 *
 * Created by Vauke on 2019-08-01 22:07
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        int count = 0;

        for (int i = 0, len = a.length() > b.length() ? b.length() : a.length(); i < len; i++) {
            if (a.charAt(i) != b.charAt(i))
                count++;
            else break;
        }

        return count == 0 ? -1 : count;
    }
}
