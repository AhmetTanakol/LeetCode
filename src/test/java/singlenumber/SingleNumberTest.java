package singlenumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        int foundNumber = singleNumber.singleNumber(nums);
        assertEquals(4, foundNumber);
    }
}
