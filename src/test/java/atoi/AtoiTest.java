package atoi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtoiTest {

    private Atoi atoi;

    @Before
    public void setUp() {
        atoi = new Atoi();
    }

    @Test
    public void myAtoi_1() {
        String number = "42";
        int result = atoi.myAtoi(number);
        assertEquals(42, result);
    }

    @Test
    public void myAtoi_2() {
        String number = "-42";
        int result = atoi.myAtoi(number);
        assertEquals(-42, result);
    }

    @Test
    public void myAtoi_3() {
        String number = "4193 with words";
        int result = atoi.myAtoi(number);
        assertEquals(4193, result);
    }

    @Test
    public void myAtoi_4() {
        String number = "words and 987";
        int result = atoi.myAtoi(number);
        assertEquals(0, result);
    }

    @Test
    public void myAtoi_5() {
        String number = "-91283472332";
        int result = atoi.myAtoi(number);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void myAtoi_6() {
        String number = "+-2";
        int result = atoi.myAtoi(number);
        assertEquals(0, result);
    }

    @Test
    public void myAtoi_7() {
        String number = "   +0 123";
        int result = atoi.myAtoi(number);
        assertEquals(0, result);
    }

    @Test
    public void myAtoi_8() {
        String number = "9223372036854775808";
        int result = atoi.myAtoi(number);
        assertEquals(Integer.MAX_VALUE, result);
    }
}
