package easy.convert_sorted_array_to_binary_search_tree_108;

/**
 * @author Aleksey Kurkov. Created on 08.01.20
 * @version 1.0 Definition for a binary tree node.
 */
public class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }

  @Override
  public String toString() {
    return "{" +
        "val=" + val +
        ", left=" + left +
        ", right=" + right +
        '}';
  }
}
