package com.vauke.string.easy;

/**
 * No.1108
 * Difficulty : Easy
 * Title      : Defanging an IP Address
 * url        : https://leetcode.com/problems/defanging-an-ip-address/
 *
 * Created by Vauke on 2019-07-29 22:07
 */
public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        StringBuffer buffer = new StringBuffer();
        char c;

        for (int i = 0, len = address.length(); i < len; i++) {
            c = address.charAt(i);

            if (c == '.')
                buffer.append("[.]");
            else
                buffer.append(c);
        }

        return buffer.toString();
    }
}
