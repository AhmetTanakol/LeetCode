package binarytreediameter;

/*
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 */
public class BinaryTreeDiameter {

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        TreeNode currentNode = root;
        traverseTree(currentNode);

        return maxDiameter;
    }

    private int traverseTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = 1 + traverseTree(node.left);
        }
        if (node.right != null) {
            right = 1 + traverseTree(node.right);
        }

        int currentDiameter = left + right;
        if (currentDiameter > maxDiameter) {
            maxDiameter = currentDiameter;
        }

        return Math.max(left, right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
