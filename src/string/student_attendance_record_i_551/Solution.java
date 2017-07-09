package string.student_attendance_record_i_551;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 * @version 1.0
 *          Solution of problem 551
 *          https://leetcode.com/problems/student-attendance-record-i
 */

public class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                countA++;

                if (countA > 1) {
                    return false;
                }

            } else if (s.charAt(i) == 'L') {
                countL++;

                if (countL > 2) {
                    return false;
                }

                if (i + 1 < s.length()) {

                    if (s.charAt(i + 1) != 'L') {
                        countL = 0;
                    }
                }
            }
        }

        return true;
    }
}