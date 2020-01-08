package easy.convert_sorted_array_to_binary_search_tree_108;

/**
 * @author Aleksey Kurkov. Created on 08.01.20
 * @version 1.0
 * Solution of problem 108
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        TreeNode root = convertRecursive(nums, 0, nums.length - 1);

        return root;
    }

    private TreeNode convertRecursive(int[] nums, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return new TreeNode(nums[startIndex]);
        }

        if (startIndex > endIndex) {
            return null;
        }

        if (endIndex - startIndex == 1) {
            TreeNode node = new TreeNode(nums[endIndex]);
            node.left = new TreeNode(nums[startIndex]);
            return node;
        }

        int midIndex = (startIndex + endIndex) / 2;
        TreeNode root = new TreeNode(nums[midIndex]);
        root.left = convertRecursive(nums, startIndex, midIndex - 1);
        root.right = convertRecursive(nums, midIndex + 1, endIndex);

        return root;
    }
}