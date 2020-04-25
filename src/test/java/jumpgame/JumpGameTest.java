package jumpgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameTest {

    private JumpGame jumpGame;

    @Before
    public void setUp() {
        jumpGame = new JumpGame();
    }

    @Test
    public void canJump_1() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void canJump_2() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(jumpGame.canJump(nums));
    }

    @Test
    public void canJump_3() {
        int[] nums = {2, 0, 0};
        assertTrue(jumpGame.canJump(nums));
    }
}
