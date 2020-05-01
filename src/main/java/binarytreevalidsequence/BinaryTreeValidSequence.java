package binarytreevalidsequence;

public class BinaryTreeValidSequence {

    public boolean isValidSequence(TreeNode root, int[] arr) {
        return validSequenceHelper(root, 0, arr);
    }

    private boolean validSequenceHelper(TreeNode node, int index, int[] arr) {
        if (node == null) {
            return false;
        }

        if (index == (arr.length - 1)) {
            return node.left == null & node.right == null && node.val == arr[index];

        }

        if (node.val == arr[index]) {
            boolean leftResult = validSequenceHelper(node.left, index + 1, arr);
            boolean rightResult = validSequenceHelper(node.right, index + 1, arr);

            return leftResult || rightResult;
        }

        return false;
    }

    public static class TreeNode {
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
