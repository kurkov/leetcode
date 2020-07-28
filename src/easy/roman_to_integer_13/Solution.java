package easy.roman_to_integer_13;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksey Kurkov. Created on 08.01.20
 * @version 1.0 Solution of problem 13 https://leetcode.com/problems/roman-to-integer
 */
class Solution {

  public int romanToInt(String s) {
    int result = 0;

    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    char[] charArray = s.toCharArray();

    for (int i = 0; i < charArray.length; i++) {
      if (i + 1 < charArray.length) {
        Character current = charArray[i];
        Character next = charArray[i + 1];

        if (map.get(current) < map.get(next)) {
          result = result - map.get(current);
        } else {
          result = result + map.get(current);
        }
      } else {
        result = result + map.get(charArray[i]);
      }
    }

    return result;
  }
}