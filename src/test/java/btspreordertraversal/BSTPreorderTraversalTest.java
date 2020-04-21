package btspreordertraversal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTPreorderTraversalTest {

    private BSTPreorderTraversal bstPreorderTraversal;

    @Before
    public void setUp() {
        bstPreorderTraversal = new BSTPreorderTraversal();
    }

    @Test
    public void bstFromPreorder_1() {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        BSTPreorderTraversal.TreeNode rootNode = bstPreorderTraversal.bstFromPreorder(preorder);
        assertNotNull(rootNode);
    }

    @Test
    public void bstFromPreorder_2() {
        int[] preorder = {8, 5, 7, 10, 12};
        BSTPreorderTraversal.TreeNode rootNode = bstPreorderTraversal.bstFromPreorder(preorder);
        assertNotNull(rootNode);
    }

    @Test
    public void bstFromPreorder_3() {
        int[] preorder = {7, 20, 19, 12};
        BSTPreorderTraversal.TreeNode rootNode = bstPreorderTraversal.bstFromPreorder(preorder);
        assertNotNull(rootNode);
    }
}
