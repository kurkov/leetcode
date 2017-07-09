package array.single_element_in_a_sorted_array_540;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 *         Solution to problem 540
 *         https://leetcode.com/problems/single-element-in-a-sorted-array
 */

public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            if ((i + 1 == nums.length) || (nums[i] != nums[i + 1])) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
