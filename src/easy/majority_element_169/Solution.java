package easy.majority_element_169;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksey Kurkov. Created on 03.01.20
 * @version 1.0 Solution of the problem 169 https://leetcode.com/problems/majority-element
 */
class Solution {

  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int minTimesCount = nums.length / 2;
    int key = 0;

    for (int i = 0; i < nums.length; i++) {
      key = nums[i];

      if (map.containsKey(key)) {
        int value = map.get(nums[i]);

        value++;
        map.replace(key, value);

        if (value > minTimesCount) {
          break;
        }
      } else {
        map.put(key, 1);
      }
    }

    return key;
  }
}