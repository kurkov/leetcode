package string.reverse_words_in_a_string_iii_557;

/**
 * @author Aleksey Kurkov. Created on 08.07.2017
 * @version 1.0 Solution of problem 557 https://leetcode.com/problems/reverse-words-in-a-string-iii
 */

public class Solution {

  public String reverseWords(String s) {
    StringBuilder stringBuilder = new StringBuilder(s.length());

    int beginWordIndex = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        stringBuilder.append(getReversedWord(s.substring(beginWordIndex, i)));
        stringBuilder.append(" ");
        beginWordIndex = i + 1;
      }

      if (i == s.length() - 1) {
        stringBuilder.append(getReversedWord(s.substring(beginWordIndex)));
      }
    }

    return stringBuilder.toString();
  }

  private String getReversedWord(String word) {
    StringBuilder stringBuilder = new StringBuilder(word.length());

    for (int i = word.length() - 1; i >= 0; i--) {
      stringBuilder.append(word.charAt(i));
    }

    return stringBuilder.toString();
  }
}
