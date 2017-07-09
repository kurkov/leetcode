package string.reverse_string_ii_541;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 * @version 1.0
 *          Solution of problem 541
 *          https://leetcode.com/problems/reverse-string-ii
 */

public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder(s.length());

        if (s.length() <= k) {
            return reverse(s);
        } else if (s.length() > k && s.length() <= 2 * k) {
            String partK = s.substring(0, k);
            result.append(reverse(partK));
            result.append(s.substring(partK.length()));
            return result.toString();
        } else {
            for (int beginIndex = 0; beginIndex + 2 * k < s.length(); beginIndex = beginIndex + 2 * k) {
                String part2k = s.substring(beginIndex, beginIndex + 2 * k);
                String partK = s.substring(beginIndex, beginIndex + k);

                if (part2k.length() < k) {
                    result.append(reverse(part2k));
                }

                if (part2k.length() <= 2 * k && part2k.length() >= k) {
                    result.append(reverse(partK));
                    result.append(part2k.substring(partK.length()));
                }
            }

            if (result.length() < s.length()) {
                String endPart = s.substring(result.length());

                if (endPart.length() <= k) {
                    result.append(reverse(endPart));
                } else if (endPart.length() > k && endPart.length() <= 2 * k) {
                    String partK = endPart.substring(0, k);
                    result.append(reverse(partK));
                    result.append(endPart.substring(partK.length()));
                }
            }
        }

        return result.toString();
    }

    private String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length());

        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }
}