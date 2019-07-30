package com.vauke.string.easy;

/**
 * No.657
 * Difficulty : Easy
 * Title      : Robot Return to Origin
 * url        : https://leetcode.com/problems/robot-return-to-origin/
 *
 * Created by Vauke on 2019-07-30 22:27
 */
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int countX = 0;
        int countY = 0;

        for (int i = 0, len = moves.length(); i < len; i++) {
            char c = moves.charAt(i);

            if (c == 'L')
                countX--;
            else if (c == 'R')
                countX++;
            else if (c == 'U')
                countY++;
            else if (c == 'D')
                countY--;
        }

        return countX == 0 && countY == 0;
    }
}
