package easy.move_zeroes_283;

/**
 * @author Aleksey Kurkov. Created on 27.12.19
 * @version 1.0
 * Solution of the problem 283
 * https://leetcode.com/problems/move-zeroes
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int[] numIndex = new int[nums.length];

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                numIndex[j] = i;
                j++;
            }
        }

        j = 0;
        for (int i = 0; i < nums.length; i++) {

            nums[i] = nums[numIndex[j]];
            j++;

            if (j == nums.length - zeroCount) {
                break;
            }
        }

        for (int i = nums.length - zeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}