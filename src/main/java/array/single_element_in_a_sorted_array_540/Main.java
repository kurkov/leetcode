package array.single_element_in_a_sorted_array_540;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 */
public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
    System.out.println(solution.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
    System.out.println(solution.singleNonDuplicate(new int[]{1, 1, 2}));
  }
}
