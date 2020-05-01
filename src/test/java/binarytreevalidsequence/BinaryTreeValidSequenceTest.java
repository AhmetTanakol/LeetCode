package binarytreevalidsequence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeValidSequenceTest {

    private BinaryTreeValidSequence binaryTreeValidSequence;

    @Before
    public void setUp() {
        binaryTreeValidSequence = new BinaryTreeValidSequence();
    }

    @Test
    public void isValidSequence_1() {
        BinaryTreeValidSequence.TreeNode node_1 = new BinaryTreeValidSequence.TreeNode(1);
        BinaryTreeValidSequence.TreeNode node_2 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_3 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_4 = new BinaryTreeValidSequence.TreeNode(0, null, node_1);
        BinaryTreeValidSequence.TreeNode node_5 = new BinaryTreeValidSequence.TreeNode(1, node_2, node_3);
        BinaryTreeValidSequence.TreeNode node_6 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_7 = new BinaryTreeValidSequence.TreeNode(1, node_4, node_5);
        BinaryTreeValidSequence.TreeNode node_8 = new BinaryTreeValidSequence.TreeNode(0, node_6, null);
        BinaryTreeValidSequence.TreeNode root = new BinaryTreeValidSequence.TreeNode(0, node_7, node_8);

        int[] sequence = {0, 1, 0, 1};
        assertTrue(binaryTreeValidSequence.isValidSequence(root, sequence));

    }

    @Test
    public void isValidSequence_2() {
        BinaryTreeValidSequence.TreeNode node_1 = new BinaryTreeValidSequence.TreeNode(1);
        BinaryTreeValidSequence.TreeNode node_2 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_3 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_4 = new BinaryTreeValidSequence.TreeNode(0, null, node_1);
        BinaryTreeValidSequence.TreeNode node_5 = new BinaryTreeValidSequence.TreeNode(1, node_2, node_3);
        BinaryTreeValidSequence.TreeNode node_6 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_7 = new BinaryTreeValidSequence.TreeNode(1, node_4, node_5);
        BinaryTreeValidSequence.TreeNode node_8 = new BinaryTreeValidSequence.TreeNode(0, node_6, null);
        BinaryTreeValidSequence.TreeNode root = new BinaryTreeValidSequence.TreeNode(0, node_7, node_8);

        int[] sequence = {0, 0, 1};
        assertFalse(binaryTreeValidSequence.isValidSequence(root, sequence));

    }

    @Test
    public void isValidSequence_3() {
        BinaryTreeValidSequence.TreeNode node_1 = new BinaryTreeValidSequence.TreeNode(1);
        BinaryTreeValidSequence.TreeNode node_2 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_3 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_4 = new BinaryTreeValidSequence.TreeNode(0, null, node_1);
        BinaryTreeValidSequence.TreeNode node_5 = new BinaryTreeValidSequence.TreeNode(1, node_2, node_3);
        BinaryTreeValidSequence.TreeNode node_6 = new BinaryTreeValidSequence.TreeNode(0);
        BinaryTreeValidSequence.TreeNode node_7 = new BinaryTreeValidSequence.TreeNode(1, node_4, node_5);
        BinaryTreeValidSequence.TreeNode node_8 = new BinaryTreeValidSequence.TreeNode(0, node_6, null);
        BinaryTreeValidSequence.TreeNode root = new BinaryTreeValidSequence.TreeNode(0, node_7, node_8);

        int[] sequence = {0, 1, 1};
        assertFalse(binaryTreeValidSequence.isValidSequence(root, sequence));

    }

    @Test
    public void isValidSequence_4() {
        BinaryTreeValidSequence.TreeNode root = new BinaryTreeValidSequence.TreeNode(0);

        int[] sequence = {0, 1, 1};
        assertFalse(binaryTreeValidSequence.isValidSequence(root, sequence));

    }

}
