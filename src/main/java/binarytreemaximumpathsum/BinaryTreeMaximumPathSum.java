package binarytreemaximumpathsum;

/*
Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:

Input: [1,2,3]

       1
      / \
     2   3

Output: 6
Example 2:

Input: [-10,9,20,null,null,15,7]

   -10
   / \
  9  20
    /  \
   15   7

Output: 42
 */
public class BinaryTreeMaximumPathSum {

    private Integer maxSum;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxSum = root.val;
        maximumPathUtil(root);
        return maxSum;
    }

    private int maximumPathUtil(TreeNode node) {
        int leftSum = node.left == null ? 0 : maximumPathUtil(node.left);
        int rightSum = node.right == null ? 0 : maximumPathUtil(node.right);
        int totalSum = node.val + leftSum + rightSum;
        int total = Math.max(node.val, Math.max((node.val + leftSum), (node.val + rightSum)));

        maxSum = Math.max(maxSum, Math.max(totalSum, total));

        return total;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
