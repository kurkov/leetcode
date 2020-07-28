package easy.two_sum_1.solution_1_brute_force;

/**
 * @author Aleksey Kurkov. Created on 28.07.2020
 * @version 1.0 Solution 1 (brute force) of problem 1 https://leetcode.com/problems/two-sum
 */
public class Solution {

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          return new int[]{i, j};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}