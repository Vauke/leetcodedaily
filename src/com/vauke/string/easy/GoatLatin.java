package com.vauke.string.easy;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;

/**
 * No.824
 * Difficulty : Easy
 * Title      : Goat Latin
 * url        : https://leetcode.com/problems/goat-latin/
 *
 * Created by Vauke on 2019-07-31 22:26
 */
public class GoatLatin {
    public String toGoatLatin(String s) {
        String vowelsReg = "[aeiouAEIOU]";

        String[] arr = s.split("\\s");
        Pattern pattern = Pattern.compile(vowelsReg);

        for (int i = 0, len = arr.length; i < len; i++) {
            String target = arr[i];
            StringBuffer buffer = new StringBuffer(target);
            char c = buffer.charAt(0);

            if (pattern.matcher(vowelsReg).matches())
                buffer.append("ma");
            else
                buffer.deleteCharAt(0).append(c).append("ma");

            for (int j = 0; j < i; j++)
                buffer.append("a");

            arr[i] = buffer.toString();
        }

        String result = Arrays.toString(arr).replace(",", " ");
        return result.substring(1, result.length() - 1);
    }
}
