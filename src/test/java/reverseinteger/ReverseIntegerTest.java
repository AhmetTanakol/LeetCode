package reverseinteger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @Before
    public void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void reverse_1() {
        int result = reverseInteger.reverse(123);
        assertEquals(321, result);
    }

    @Test
    public void reverse_2() {
        int result = reverseInteger.reverse(-123);
        assertEquals(-321, result);
    }

    @Test
    public void reverse_3() {
        int result = reverseInteger.reverse(120);
        assertEquals(21, result);
    }

    @Test
    public void reverse_4() {
        int result = reverseInteger.reverse(1534236469);
        assertEquals(0, result);
    }
}
