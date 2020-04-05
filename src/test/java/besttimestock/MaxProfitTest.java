package besttimestock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTest {

    private MaxProfit maxProfit;

    @Before
    public void setUp() {
        maxProfit = new MaxProfit();
    }

    @Test
    public void maxProfit_1() {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit.maxProfit(prices);
        assertEquals(7, result);
    }

    @Test
    public void maxProfit_2() {
        int[] prices = {1,2,3,4,5};
        int result = maxProfit.maxProfit(prices);
        assertEquals(4, result);
    }

    @Test
    public void maxProfit_3() {
        int[] prices = {7,6,4,3,1};
        int result = maxProfit.maxProfit(prices);
        assertEquals(0, result);
    }
}
