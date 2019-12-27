package easy.maximum_depth_of_binary_tree_104;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 27.12.19
 * @version 1.0
 */
public class SolutionTest {

    @Test
    public void getCorrectResult() {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int expectedResult = 3;
        int actualResult = solution.maxDepth(root);

        assertEquals(expectedResult, actualResult);
    }
}
