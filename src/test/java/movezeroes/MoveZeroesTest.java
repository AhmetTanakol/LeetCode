package movezeroes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    private MoveZeroes moveZeroes;

    @Before
    public void setUp() {
        moveZeroes = new MoveZeroes();
    }

    @Test
    public void moveZeroes() {
        int[] nums = {0,1,0,3,12};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }
}
