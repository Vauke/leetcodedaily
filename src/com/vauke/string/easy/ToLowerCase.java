package com.vauke.string.easy;

/**
 * No.709
 * Difficulty : Easy
 * Title      : To Lower Case
 * url        : https://leetcode.com/problems/to-lower-case/
 *
 * Created by Vauke on 2019-07-30 22:02
 */
public class ToLowerCase {
    public String toLowerCase(Stirng str) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0, len = str.length(); i < len; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
                buffer.append((char) (c - 'A' + 'a'));
            else
                buffer.append(c);
        }

        return buffer.toString();
    }
}
