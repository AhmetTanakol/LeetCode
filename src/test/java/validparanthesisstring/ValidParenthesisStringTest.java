package validparanthesisstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisStringTest {

    private ValidParenthesisString validParenthesisString;

    @Before
    public void setUp() {
        validParenthesisString = new ValidParenthesisString();
    }

    @Test
    public void checkValidString_1() {
        String s = "()";
        assertTrue(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_2() {
        String s = "(*)";
        assertTrue(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_3() {
        String s = "";
        assertTrue(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_4() {
        String s = "(";
        assertFalse(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_5() {
        String s = "(*))";
        assertTrue(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_6() {
        String s = "(*)((*)";
        assertTrue(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_7() {
        String s = "(*";
        assertTrue(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_8() {
        String s = "(**)(())*)";
        assertTrue(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_9() {
        String s = "*";
        assertTrue(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_10() {
        String s = "(*)))";
        assertFalse(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_11() {
        String s = ")(";
        assertFalse(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_12() {
        String s = "(())((())()()(*)(*()(())())())()()((()())((()))(*";
        assertFalse(validParenthesisString.checkValidString(s));
    }

    @Test
    public void checkValidString_13() {
        String s = "(*(()))((())())*(**(()))((*)()(()))*(())()(())(()";
        assertFalse(validParenthesisString.checkValidString(s));
    }
}
