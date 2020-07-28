package easy.excel_sheet_column_number_171;

/**
 * @author Aleksey Kurkov. Created on 13.01.20
 * @version 1.0 Solution of problem 171 https://leetcode.com/problems/excel-sheet-column-number
 */

// A  = 26 * 0 + 1 = 1
// AA = 26 + 1 = 26 * 1 + 1 = 27
// BA = 26 + 26 + 1 = 26 * 2 + 1 = 53
// CA = 26 + 26 + 26 + 1 = 26 * 3 + 1 = 79

class Solution {

  public int titleToNumber(String s) {
    char[] chars = s.toCharArray();
    int result = 0;

    for (int i = 0; i < chars.length; i++) {
      result = result * 26 + chars[i] - 64;
    }

    return result;
  }
}