package longestcommonprefix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @Before
    public void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix_1() {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("fl", result);
    }

    @Test
    public void longestCommonPrefix_2() {
        String[] strs = {"dog", "racecar", "car"};
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("", result);
    }

    @Test
    public void longestCommonPrefix_3() {
        String[] strs = {"dog", ""};
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("", result);
    }
}
