package linkedlist.reverse_linked_list_206;

/**
 * @author Aleksey Kurkov. Created on 10.07.2017
 * @version 1.0
 */
public class Main {

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    listNode1.next = listNode2;
    listNode2.next = listNode3;
    System.out.println(listNode1);

    Solution solution = new Solution();
    System.out.println(solution.reverseList(listNode1));
  }
}
