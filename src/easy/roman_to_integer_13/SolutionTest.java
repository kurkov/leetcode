package easy.roman_to_integer_13;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Aleksey Kurkov. Created on 08.01.20
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
    String input = "III";

    int expectedResult = 3;
    int actualResult = solution.romanToInt(input);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testExample2() {
    String input = "IV";

    int expectedResult = 4;
    int actualResult = solution.romanToInt(input);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testExample3() {
    String input = "IX";

    int expectedResult = 9;
    int actualResult = solution.romanToInt(input);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testExample4() {
    String input = "LVIII";

    int expectedResult = 58;
    int actualResult = solution.romanToInt(input);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testExample5() {
    String input = "MCMXCIV";

    int expectedResult = 1994;
    int actualResult = solution.romanToInt(input);

    assertEquals(expectedResult, actualResult);
  }
}
