package easy.move_zeroes_283;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Aleksey Kurkov. Created on 27.12.19
 * @version 1.0
 */
public class SolutionTest {

    @Test
    public void testExample() {
        int[] nums = {0, 1, 0, 3, 12};
        Solution solution = new Solution();

        int[] expectedResult = {1, 3, 12, 0, 0};
        solution.moveZeroes(nums);

        assertArrayEquals(expectedResult, nums);
    }
}
