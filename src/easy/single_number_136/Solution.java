package easy.single_number_136;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 26.12.2019
 * @version 1.0
 * Solution of problem 136
 * https://leetcode.com/problems/single-number
 */

class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            Integer value = nums[i];
            if (list.contains(value)) {
                list.remove(value);
            } else {
                list.add(value);
            }
        }

        return list.get(0);
    }
}