package easy.delete_node_in_a_linked_list_237;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 27.12.19
 * @version 1.0
 */
public class SolutionTest {

    @Test
    public void testExample1() {
        Solution solution = new Solution();

        ListNode root = new ListNode(4);
        ListNode node5 = new ListNode(5);
        root.next = node5;
        root.next.next = new ListNode(1);
        root.next.next.next = new ListNode(9);

        solution.deleteNode(node5);

        assertEquals(4, root.val);
        assertEquals(1, root.next.val);
        assertEquals(9, root.next.next.val);
    }

    @Test
    public void testExample2() {
        Solution solution = new Solution();

        ListNode root = new ListNode(4);
        root.next = new ListNode(5);
        ListNode node1 = new ListNode(1);
        root.next.next = node1;
        root.next.next.next = new ListNode(9);

        solution.deleteNode(node1);

        assertEquals(4, root.val);
        assertEquals(5, root.next.val);
        assertEquals(9, root.next.next.val);
    }
}
