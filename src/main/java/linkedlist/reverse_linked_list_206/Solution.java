package linkedlist.reverse_linked_list_206;

/**
 * @author Aleksey Kurkov. Created on 10.07.2017
 * @version 1.0 Solution of problem 206 https://leetcode.com/problems/reverse-linked-list
 */

// Definition for singly-linked list.
//  public class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
// }

public class Solution {

  public ListNode reverseList(ListNode head) {
    ListNode result = null;
    while (head != null) {
      if (result == null) {
        result = new ListNode(head.val);
      } else {
        ListNode temp = result;
        result = new ListNode(head.val);
        result.next = temp;
      }
      head = head.next;
    }
    return result;
  }
}