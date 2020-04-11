package binarytreediameter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeDiameterTest {

    BinaryTreeDiameter binaryTreeDiameter;

    @Before
    public void setUp() {
        binaryTreeDiameter = new BinaryTreeDiameter();
    }

    @Test
    public void diameterOfBinaryTree_1() {
        BinaryTreeDiameter.TreeNode treeNode = new BinaryTreeDiameter.TreeNode(1);
        treeNode.left = new BinaryTreeDiameter.TreeNode(2);
        treeNode.right = new BinaryTreeDiameter.TreeNode(3);

        treeNode.left.left = new BinaryTreeDiameter.TreeNode(4);
        treeNode.left.right = new BinaryTreeDiameter.TreeNode(5);

        int result = binaryTreeDiameter.diameterOfBinaryTree(treeNode);

        assertEquals(3, result);
    }

    @Test
    public void diameterOfBinaryTree_2() {
        BinaryTreeDiameter.TreeNode treeNode = new BinaryTreeDiameter.TreeNode(1);
        treeNode.left = new BinaryTreeDiameter.TreeNode(2);
        int result = binaryTreeDiameter.diameterOfBinaryTree(treeNode);

        assertEquals(1, result);
    }

}
