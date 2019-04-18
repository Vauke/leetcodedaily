package com.vauke.string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * No.804
 * Difficulty : Easy
 * Title      : Unique Morse Code Words
 * url        : https://leetcode-cn.com/problems/unique-morse-code-words
 *
 * Created by Vauke on 2019-04-18 16:05
 */
public class UniqueMoseCodeWords {
    /* 26/0.75 = 35 */
    private static Map<Character, String> mapper = new HashMap<>(35);

    static {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (int i = 0; i < 26; i++) {
            mapper.put((char)(i + 97), morse[i]);
        }
    }

    public int uniqueMorseRepresentations(String[] words) {
        StringBuffer single = new StringBuffer();
        Set<String> result = new HashSet<>();

        for (int i = 0, len = words.length, wLen = 0; i < len; i++) {
            String word = words[i];
            wLen = word.length();

            for (int j = 0; j < wLen;j++){
                single.append(mapper.get(word.charAt(j)));
            }

            result.add(single.toString());
            single.delete(0, single.length());
        }

        return result.size();
    }
}
