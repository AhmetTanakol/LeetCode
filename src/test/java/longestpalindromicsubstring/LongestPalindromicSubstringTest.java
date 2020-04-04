package longestpalindromicsubstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring longestPalindromicSubstring;

    @Before
    public void setUp() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    public void longestPalindrome_1() {
        String example = "babad";
        String result = longestPalindromicSubstring.longestPalindrome(example);
        assertEquals("bab", result);
    }

    @Test
    public void longestPalindrome_2() {
        String example = "cbbd";
        String result = longestPalindromicSubstring.longestPalindrome(example);
        assertEquals("bb", result);
    }

    @Test
    public void longestPalindrome_3() {
        String example = "";
        String result = longestPalindromicSubstring.longestPalindrome(example);
        assertEquals("", result);
    }

    @Test
    public void longestPalindrome_4() {
        String example = "bb";
        String result = longestPalindromicSubstring.longestPalindrome(example);
        assertEquals("bb", result);
    }
}
