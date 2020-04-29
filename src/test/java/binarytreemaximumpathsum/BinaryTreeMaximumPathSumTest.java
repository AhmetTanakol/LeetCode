package binarytreemaximumpathsum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeMaximumPathSumTest {

    private BinaryTreeMaximumPathSum binaryTreeMaximumPathSum;

    @Before
    public void setUp() {
        binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
    }

    @Test
    public void maxPathSum_1() {
        BinaryTreeMaximumPathSum.TreeNode leftNode = new BinaryTreeMaximumPathSum.TreeNode(2);
        BinaryTreeMaximumPathSum.TreeNode rightNode = new BinaryTreeMaximumPathSum.TreeNode(3);
        BinaryTreeMaximumPathSum.TreeNode parentNode = new BinaryTreeMaximumPathSum.TreeNode(1, leftNode, rightNode);

        int result = binaryTreeMaximumPathSum.maxPathSum(parentNode);

        assertEquals(6, result);
    }

    @Test
    public void maxPathSum_2() {
        BinaryTreeMaximumPathSum.TreeNode leftNode = new BinaryTreeMaximumPathSum.TreeNode(9);
        BinaryTreeMaximumPathSum.TreeNode leftOfRightNode = new BinaryTreeMaximumPathSum.TreeNode(15);
        BinaryTreeMaximumPathSum.TreeNode rightOfrightNode = new BinaryTreeMaximumPathSum.TreeNode(7);
        BinaryTreeMaximumPathSum.TreeNode rightNode = new BinaryTreeMaximumPathSum.TreeNode(20, leftOfRightNode, rightOfrightNode);
        BinaryTreeMaximumPathSum.TreeNode parentNode = new BinaryTreeMaximumPathSum.TreeNode(-10, leftNode, rightNode);

        int result = binaryTreeMaximumPathSum.maxPathSum(parentNode);

        assertEquals(42, result);
    }
}
