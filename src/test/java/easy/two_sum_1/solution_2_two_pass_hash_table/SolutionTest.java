package easy.two_sum_1.solution_2_two_pass_hash_table;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author Aleksey Kurkov. Created on 28.07.2020
 * @version 1.0
 */
public class SolutionTest {

  @Test
  public void testExample() {
    // given
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    // when
    Solution solution = new Solution();
    int[] actualResult = solution.twoSum(nums, target);

    // then
    int[] expectedResult = {0, 1};
    assertArrayEquals(expectedResult, actualResult);
  }
}
