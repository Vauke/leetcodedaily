package com.vauke.string.easy;

/**
 * No.387
 * Difficulty : Easy
 * Title      : First Unique Character in a String
 * url        : https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Created by Vauke on 2019-04-23 19:40
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int i = 0;
        int len = s.length();
        int ans = -1;

        if (len == 1) return 0;

        while (i < len) {
            char c = s.charAt(i);
            int j = 0;
            
            for (; j < len; j++) {
                char target = s.charAt(j);
                if (i == j) continue;
                if (c == target) break;
            }
            
            if (j == len) {
                ans = i;
                break;
            }

            i++;
        }

        return ans;
    }

    // another way
    public int firstUniqChar1(String s) {
        int[] counts = new int[26];
        char[] c = s.toCharArray();

        for (int i = 0, len = c.length; i < len; i++) {
            counts[c[i] - 'a']++;
        }

        for (int i = 0, len = c.length; i < len; i++) {
            if (counts[c[i] - 'a'] == 1) return i;
        }

        return -1;
    }
}
