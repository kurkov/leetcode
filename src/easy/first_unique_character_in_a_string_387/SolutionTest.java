package easy.first_unique_character_in_a_string_387;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        s = "leetcode";

        int expectedResult = 0;
        int actualResult = solution.firstUniqChar(s);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExample2() {
        s = "loveleetcode";

        int expectedResult = 2;
        int actualResult = solution.firstUniqChar(s);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExample3() {
        s = "cc";

        int expectedResult = -1;
        int actualResult = solution.firstUniqChar(s);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExample4() {
        s = "z";

        int expectedResult = 0;
        int actualResult = solution.firstUniqChar(s);

        assertEquals(expectedResult, actualResult);
    }
}