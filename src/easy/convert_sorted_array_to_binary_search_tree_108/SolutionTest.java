package easy.convert_sorted_array_to_binary_search_tree_108;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 08.01.20
 * @version 1.0
 */
public class SolutionTest {

    @Test
    public void testExample() {
        Solution solution = new Solution();
        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode expectedResult = new TreeNode(0);
        expectedResult.left = new TreeNode(-3);
        expectedResult.right = new TreeNode(9);
        expectedResult.left.left = new TreeNode(-10);
        expectedResult.right.left = new TreeNode(5);

        TreeNode actualResult = solution.sortedArrayToBST(nums);

        assertEquals(expectedResult.toString(), actualResult.toString());
    }
}
