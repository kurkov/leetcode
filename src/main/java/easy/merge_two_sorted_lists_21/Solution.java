package easy.merge_two_sorted_lists_21;

/**
 * @author Aleksey Kurkov. Created on 13.01.20
 * @version 1.0 Solution of problem 21 https://leetcode.com/problems/merge-two-sorted-lists
 */
class Solution {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }

    if (l2 == null) {
      return l1;
    }

    if (l1.val < l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }
}