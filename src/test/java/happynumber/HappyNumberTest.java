package happynumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    private HappyNumber happyNumber;

    @Before
    public void setUp() {
        happyNumber = new HappyNumber();
    }

    @Test
    public void isHappy_1() {
        boolean result = happyNumber.isHappy(19);
        assertTrue(result);
    }

    @Test
    public void isHappy_2() {
        boolean result = happyNumber.isHappy(2);
        assertFalse(result);
    }
}
