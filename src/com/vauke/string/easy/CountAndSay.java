package com.vauke.string.easy;

/**
 * No.38
 * Difficulty : Easy
 * Title      : Count and Say
 * url        : https://leetcode.com/problems/count-and-say/
 *
 * Created by Vauke on 2019-04-20 22:03
 */
public class CountAndSay {
    public String countAndSay1(int n) {
        if (n < 1 || n > 30) return "";
        return doCount("1", n);
    }

    public String doCount(String s, int n) {
        if (n <= 1) return s;

        char[] c = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        int length = c.length;

        for (int i = 0, j = 0, count = 0; i < length; i = j) {
            count = 1;
            char temp = c[i];
            j = i + 1;

            while (j < length && c[j] == temp) {
                count++;
                j++;
            }

            builder.append("" + count + c[i]);
        }

        return doCount(builder.toString(), --n);
    }

    private StringBuilder builder = new StringBuilder("1");

    public String countAndSay(int n) {
        if (n < 1 || n > 30) return "";

        if (n <= 1) return builder.toString();

        char[] c = builder.toString().toCharArray();

        int length = c.length;

        builder = new StringBuilder();

        for (int i = 0, j = 0, count = 0; i < length; i = j) {
            count = 1;
            char temp = c[i];
            j = i + 1;

            while (j < length && c[j] == temp) {
                count++;
                j++;
            }

            builder.append("" + count + c[i]);
        }

        return countAndSay(--n);
    }
}
