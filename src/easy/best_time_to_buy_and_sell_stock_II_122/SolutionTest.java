package easy.best_time_to_buy_and_sell_stock_II_122;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 09.01.20
 * @version 1.0
 */
public class SolutionTest {

    private Solution solution;
    private int[] prices;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void testExample1() {
        prices = new int[]{7, 1, 5, 3, 6, 4};

        int expectedResult = 7;
        int actualResult = solution.maxProfit(prices);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExample2() {
        prices = new int[]{1, 2, 3, 4, 5};

        int expectedResult = 4;
        int actualResult = solution.maxProfit(prices);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExample3() {
        prices = new int[]{7, 6, 4, 3, 1};

        int expectedResult = 0;
        int actualResult = solution.maxProfit(prices);

        assertEquals(expectedResult, actualResult);
    }
}
