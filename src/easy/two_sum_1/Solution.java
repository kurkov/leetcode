package easy.two_sum_1;

/**
 * @author Aleksey Kurkov. Created on 07.04.2019
 * @version 1.0
 * Solution of problem 1
 * https://leetcode.com/problems/two-sum
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];

        for (int i = 0; i < length - 2; i++) {
            if (nums[i] + nums[i + 1] == target) {
                result[0] = i;
                result[1] = i + 1;

                break;
            }
        }

        return result;
    }
}