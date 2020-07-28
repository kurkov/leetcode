package easy.fizz_buzz_412;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 25.12.2019
 * @version 1.0 Solution of problem 412 https://leetcode.com/problems/fizz-buzz
 */

class Solution {

  public List<String> fizzBuzz(int n) {
    List<String> list = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 != 0) {
        list.add("Fizz");
      } else if (i % 3 != 0 && i % 5 == 0) {
        list.add("Buzz");
      } else if (i % 3 == 0 && i % 5 == 0) {
        list.add("FizzBuzz");
      } else {
        list.add(Integer.toString(i));
      }
    }

    return list;
  }
}