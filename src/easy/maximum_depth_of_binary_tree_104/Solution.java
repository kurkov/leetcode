package easy.maximum_depth_of_binary_tree_104;

/**
 * @author Aleksey Kurkov. Created on 27.12.19
 * @version 1.0
 * Solution of problem 104
 * https://leetcode.com/problems/maximum-depth-of-binary-tree
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int result;

        if (root == null) {
            return 0;
        }

        result = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

        return result;
    }
}