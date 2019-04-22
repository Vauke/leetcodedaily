package com.vauke.string.easy;

import java.util.Map;
import java.util.HashMap;

/**
 * No.13
 * Difficulty : Easy
 * Title      : Roman to Integer
 * url        : https://leetcode.com/problems/roman-to-integer/
 *
 * Created by Vauke on 2019-04-22 20:28
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        /* 7 / 0.75 + 1 = 10, default initialCapacity is 16 */
        Map<Character, Integer> map = new HashMap<Character, Integer>(10) {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int ans = 0;
        int len = s.length();
        int num1, num2, i;

        for (i = 0; i < len - 1; i++) {
            num1 = map.get(s.charAt(i));
            num2 = map.get(s.charAt(i + 1));

            if (num1 < num2) {
                ans = ans + num2 - num1;
                i++;
            } else {
                ans += num1;
            }
        }

        /* 如果倒数第二个不小于最后一个的话, 出了循环后i的值就是len - 1, 而此时最后一个元素还没加 */
        if (i == len - 1) ans += map.get(s.charAt(i));

        return ans;
    }

    // another way
    public int romanToInt1(String s) {
        int result = 0;
        
        Map<String, Integer> sin = new HashMap<String, Integer>() {{
            put("I",1);
            put("V",5);
            put("X",10);
            put("L",50);
            put("C",100);
            put("D",500);
            put("M",1000);
        }};
        
        Map<String, Integer> dou = new HashMap<String, Integer>() {{
            put("IV",4);
            put("IX",9);
            put("XL",40);
            put("XC",90);
            put("CD",400);
            put("CM",900);
        }};

        for(int i = 0, len = s.length() - 1; i < len; i++){
            result += sin.get(String.valueOf(s.charAt(i)));
            
            if (dou.containsKey(s.substring(i, i + 2))) {
                result -= sin.get(String.valueOf(s.charAt(i))) * 2;
            }
        }

        result += sin.get(String.valueOf(s.charAt(s.length() - 1)));
        return result;
    }
}
