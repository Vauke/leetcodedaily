package com.vauke.string.easy;

import java.util.Set;

/**
 * No.929
 * Difficulty : Easy
 * Title      : Unique Email Addresses
 * url        : https://leetcode-cn.com/problems/unique-email-addresses/
 *
 * Created by Vauke on 2019-04-18 15:26
 */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        String local = "";
        String domain = "";
        String[] match = {};
        int count = 0;

        for (int i = 0; i < emails.length; i++) {
            match = emails[i].split("@");

            if (emails[i].length() >= 1 && emails[i].length() <= 100) {
                local = match[0];
                domain = match[1];

                /* find first index of plus sign('+'), then substring */
                int firstIndex = local.indexOf("+");
                if (firstIndex > 0) {
                    local = local.substring(0, firstIndex);
                }
                
                /* remove periods('.') */
                local = local.replace(".", "");

                if (!set.add(local)) {   
                    if (set.add(domain)) {
                        count += 1;
                    }
                } else {
                    count += 1;
                    set.add(domain);
                }
            }
        }

        return count;
    }
}
