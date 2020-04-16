package productexceptself;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductExceptSelfTest {

    @Test
    public void productExceptSelf() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }
}
