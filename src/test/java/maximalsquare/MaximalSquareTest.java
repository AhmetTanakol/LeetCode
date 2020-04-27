package maximalsquare;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalSquareTest {

    private MaximalSquare maximalSquare;

    @Before
    public void setUp() {
        maximalSquare = new MaximalSquare();
    }

    @Test
    public void maximalSquare() {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        int result = maximalSquare.maximalSquare(matrix);

        assertEquals(4, result);
    }
}
