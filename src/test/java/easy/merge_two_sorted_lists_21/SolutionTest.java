package easy.merge_two_sorted_lists_21;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Aleksey Kurkov. Created on 13.01.20
 * @version 1.0
 */
public class SolutionTest {

  private Solution solution;

  @Before
  public void init() {
    solution = new Solution();
  }

  @Test
  public void testExample1() {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode expectedResult = new ListNode(1);
    expectedResult.next = new ListNode(1);
    expectedResult.next.next = new ListNode(2);
    expectedResult.next.next.next = new ListNode(3);
    expectedResult.next.next.next.next = new ListNode(4);
    expectedResult.next.next.next.next.next = new ListNode(4);

    ListNode actualResult = solution.mergeTwoLists(l1, l2);

    assertEquals(expectedResult.toString(), actualResult.toString());
  }
}