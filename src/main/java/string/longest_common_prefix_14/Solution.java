package string.longest_common_prefix_14;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 * @version 1.0 Solution of problem 14 https://leetcode.com/problems/longest-common-prefix
 */

public class Solution {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0 || strs == null) {
      return "";
    }

    int minStringLength = getMinStringLength(strs);

    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i == minStringLength || strs[j].charAt(i) != c) {
          return strs[0].substring(0, i);
        }
      }
    }

    return strs[0];
  }

  private int getMinStringLength(String[] strs) {
    int minStringLength = Integer.MAX_VALUE;
    for (String str : strs) {
      if (str.length() < minStringLength) {
        minStringLength = str.length();
      }
    }
    return minStringLength;
  }
}