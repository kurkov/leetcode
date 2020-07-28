package easy.majority_element_169;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Aleksey Kurkov. Created on 03.01.20
 * @version 1.0
 */
public class SolutionTest {

  @Test
  public void testExample1() {
    int[] nums = {3, 2, 3};
    Solution solution = new Solution();

    int expectedResult = 3;
    int actualResult = solution.majorityElement(nums);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testExample2() {
    int[] nums = {2, 2, 1, 1, 1, 2, 2};
    Solution solution = new Solution();

    int expectedResult = 2;
    int actualResult = solution.majorityElement(nums);

    assertEquals(expectedResult, actualResult);
  }
}
