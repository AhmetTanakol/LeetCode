package countingelements;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingElementsTest {

    private CountingElements countingElements;

    @Before
    public void setUp() {
        countingElements = new CountingElements();
    }

    @Test
    public void countElements_1() {
        int[] arr = {1,2,3};
        int result = countingElements.countElements(arr);
        assertEquals(2, result);
    }

    @Test
    public void countElements_2() {
        int[] arr = {1,1,3,3,5,5,7,7};
        int result = countingElements.countElements(arr);
        assertEquals(0, result);
    }

    @Test
    public void countElements_3() {
        int[] arr = {1,3,2,3,5,0};
        int result = countingElements.countElements(arr);
        assertEquals(3, result);
    }

    @Test
    public void countElements_4() {
        int[] arr = {1,1,2,2};
        int result = countingElements.countElements(arr);
        assertEquals(2, result);
    }
}
