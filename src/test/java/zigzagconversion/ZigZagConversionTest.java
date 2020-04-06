package zigzagconversion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    private ZigZagConversion zigZagConversion;

    @Before
    public void setUp() {
        zigZagConversion = new ZigZagConversion();
    }

    @Test
    public void convert_1() {
        String str = "PAYPALISHIRING";
        String result = zigZagConversion.convert(str, 2);
        assertEquals("PYAIHRNAPLSIIG", result);
    }

    @Test
    public void convert_2() {
        String str = "PAYPALISHIRING";
        String result = zigZagConversion.convert(str, 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    public void convert_3() {
        String str = "PAYPALISHIRING";
        String result = zigZagConversion.convert(str, 4);
        assertEquals("PINALSIGYAHRPI", result);
    }
    @Test
    public void convert_4() {
        String str = "AB";
        String result = zigZagConversion.convert(str, 1);
        assertEquals("AB", result);
    }
}
