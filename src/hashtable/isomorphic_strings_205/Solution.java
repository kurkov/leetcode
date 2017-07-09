package hashtable.isomorphic_strings_205;

import java.util.Hashtable;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 * @version 1.0
 *          Solution of problem 205
 *          https://leetcode.com/problems/isomorphic-strings
 */

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Hashtable<Character, Character> map = new Hashtable<>();
        StringBuilder result = new StringBuilder(t.length());
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) {
                    map.put(s.charAt(i), s.charAt(i));
                } else {
                    map.put(s.charAt(i), t.charAt(i));
                }
            }
            result.append(map.get(s.charAt(i)));
        }

        return t.equalsIgnoreCase(result.toString());
    }
}