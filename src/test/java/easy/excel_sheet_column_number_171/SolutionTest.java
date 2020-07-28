package easy.excel_sheet_column_number_171;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Aleksey Kurkov. Created on 13.01.20
 * @version 1.0
 */
public class SolutionTest {

  private Solution solution;
  private String s;

  @Before
  public void init() {
    solution = new Solution();
  }

  @Test
  public void testExample1() {
    s = "A";

    int expectedResult = 1;
    int actualResult = solution.titleToNumber(s);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testExample2() {
    s = "AB";

    int expectedResult = 28;
    int actualResult = solution.titleToNumber(s);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testExample3() {
    s = "ZY";

    int expectedResult = 701;
    int actualResult = solution.titleToNumber(s);

    assertEquals(expectedResult, actualResult);
  }
}
