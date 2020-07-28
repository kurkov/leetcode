package easy.two_sum_1.solution_3_one_pass_hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksey Kurkov. Created on 28.07.2020
 * @version 1.0 Solution 3 (one-pass hash table) of problem 1 https://leetcode.com/problems/two-sum
 */
public class Solution {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}