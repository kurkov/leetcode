package string.longest_common_prefix_14;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 * @version 1.0
 */
public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();

    String[] strs1 = {};
    System.out.println(solution.longestCommonPrefix(strs1));

    String[] strs2 = {
        "preconcert",
        "preconcerted",
        "preconcerting",
        "preconcerts",
        "precondition",
        "preconditioned",
        "preconditioning",
        "preconditions"};
    System.out.println(solution.longestCommonPrefix(strs2));

    String[] strs3 = {
        "areconcert",
        "breconcerted",
        "creconcerting",
        "dreconcerts",
        "erecondition",
        "freconditioned",
        "greconditioning",
        "hreconditions"};
    System.out.println(solution.longestCommonPrefix(strs3));

    String[] strs4 = {"c", "acc", "ccc"};
    System.out.println(solution.longestCommonPrefix(strs4));

    String[] strs5 = {"c", "c"};
    System.out.println(solution.longestCommonPrefix(strs5));

    String[] strs6 = {"aa", "aa"};
    System.out.println(solution.longestCommonPrefix(strs6));
  }
}
