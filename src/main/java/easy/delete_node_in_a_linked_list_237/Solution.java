package easy.delete_node_in_a_linked_list_237;

/**
 * @author Aleksey Kurkov. Created on 27.12.19
 * @version 1.0 Solution of problem 237 https://leetcode.com/problems/delete-node-in-a-linked-list
 */
class Solution {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}