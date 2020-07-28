package hashtable.word_pattern_290;

import java.util.Hashtable;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 * @version 1.0 Solution of problem 290 https://leetcode.com/problems/word-pattern
 */

public class Solution {

  public boolean wordPattern(String pattern, String str) {
    if (pattern.isEmpty()) {
      return false;
    }

    StringBuilder result = new StringBuilder();
    Hashtable<String, Character> map = new Hashtable<>();
    String[] words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (!map.containsKey(words[i])) {
        if (map.isEmpty()) {
          map.put(words[i], pattern.charAt(0));
        } else {
          if (!map.containsValue(pattern.charAt(i))) {
            map.put(words[i], pattern.charAt(i));
          } else {
            return false;
          }
        }
      }
      result.append(map.get(words[i]));

      if (!pattern.startsWith(result.toString())) {
        return false;
      }
    }
    return pattern.equalsIgnoreCase(result.toString());
  }
}