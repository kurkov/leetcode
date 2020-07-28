package easy.valid_anagram_242;

import java.util.Arrays;

/**
 * @author Aleksey Kurkov. Created on 08.01.20
 * @version 1.0 Solution of the problem 242 https://leetcode.com/problems/valid-anagram
 */
class Solution {

  public boolean isAnagram(String s, String t) {
    boolean result = false;

    if (t.length() != s.length()) {
      return false;
    } else {
      char[] charArrayS = s.toCharArray();
      char[] charArrayT = t.toCharArray();

      Arrays.sort(charArrayS);
      Arrays.sort(charArrayT);

      result = Arrays.equals(charArrayS, charArrayT);
    }

    return result;
  }
}