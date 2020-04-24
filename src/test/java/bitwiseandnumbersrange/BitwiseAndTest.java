package bitwiseandnumbersrange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitwiseAndTest {

    private BitwiseAnd bitwiseAnd;

    @Before
    public void setUp() {
        bitwiseAnd = new BitwiseAnd();
    }

    @Test
    public void rangeBitwiseAnd_1() {
        int result = bitwiseAnd.rangeBitwiseAnd(5, 7);
        assertEquals(4, result);
    }

    @Test
    public void rangeBitwiseAnd_2() {
        int result = bitwiseAnd.rangeBitwiseAnd(0, 1);
        assertEquals(0, result);
    }
}
