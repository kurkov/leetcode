package easy.valid_anagram_242;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Aleksey Kurkov. Created on 08.01.20
 * @version 1.0
 */
public class SolutionTest {

    @Test
    public void testExample1() {
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";

        boolean actualResult = solution.isAnagram(s, t);

        assertTrue(actualResult);
    }

    @Test
    public void testExample2() {
        Solution solution = new Solution();
        String s = "rat";
        String t = "car";

        boolean actualResult = solution.isAnagram(s, t);

        assertFalse(actualResult);
    }
}
