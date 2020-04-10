package MinStack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

    private MinStack minStack;

    @Before
    public void setUp() {
        minStack = new MinStack();
    }

    @Test
    public void minStack_1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

}
