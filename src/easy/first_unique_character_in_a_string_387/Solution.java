package easy.first_unique_character_in_a_string_387;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksey Kurkov. Created on 13.01.20
 * @version 1.0
 * Solution of problem 387
 * https://leetcode.com/problems/first-unique-character-in-a-string
 */
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i));
                map.replace(s.charAt(i), count + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        if (map.containsValue(1)) {
            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) == 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}