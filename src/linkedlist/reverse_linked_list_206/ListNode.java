package linkedlist.reverse_linked_list_206;

/**
 * @author Aleksey Kurkov. Created on 10.07.2017
 * @version 1.0
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
