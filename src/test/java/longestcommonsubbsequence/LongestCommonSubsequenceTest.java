package longestcommonsubbsequence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence;

    @Before
    public void setUp() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }

    @Test
    public void longestCommonSubsequence_1() {
        String text1 = "abcde";
        String text2 = "ace";
        int result = longestCommonSubsequence.longestCommonSubsequence(text1, text2);
        assertEquals(3, result);
    }
}
