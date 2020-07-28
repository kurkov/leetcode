package string.reverse_string_334;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 * @version 1.0 Solution of problem 334 https://leetcode.com/problems/reverse-string
 */

public class Solution {

  public String reverseString(String s) {
    StringBuilder stringBuilder = new StringBuilder(s.length());

    for (int i = s.length() - 1; i >= 0; i--) {
      stringBuilder.append(s.charAt(i));
    }

    return stringBuilder.toString();
  }
}