package btspreordertraversal;

import java.util.Arrays;

/*
Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)



Example 1:

Input: [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]



Note:

1 <= preorder.length <= 100
The values of preorder are distinct.
 */
public class BSTPreorderTraversal {

    public TreeNode bstFromPreorder_1(int[] preorder) {
        TreeNode parentNode = new TreeNode(preorder[0]);
        int parentVal = preorder[0];
        int[] left = Arrays.stream(preorder).filter(i -> i < parentVal).toArray();
        int[] right = Arrays.stream(preorder).filter(i -> i > parentVal).toArray();
        if (left.length != 0) {
            parentNode.left = bstFromPreorder(left);
        }
        if (right.length != 0) {
            parentNode.right = bstFromPreorder(right);
        }

        return parentNode;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode rootNode = new TreeNode(preorder[0]);
        if (preorder.length == 1) {
            return rootNode;
        }
        bstUtil(preorder, 1, rootNode);
        return rootNode;
    }

    private void bstUtil(int[] preorder, int index, TreeNode parentNode) {
        TreeNode currentNode = parentNode;
        boolean shouldContinue = true;
        while (shouldContinue) {
            if (currentNode.left != null && currentNode.val > preorder[index]) {
                currentNode = currentNode.left;
                continue;
            }
            if (currentNode.right != null && currentNode.val < preorder[index]) {
                currentNode = currentNode.right;
                continue;
            }
            shouldContinue = false;
        }
        if (currentNode.val > preorder[index]) {
            currentNode.left = new TreeNode(preorder[index]);
        }
        if (currentNode.val < preorder[index]) {
            currentNode.right = new TreeNode(preorder[index]);
        }
        index++;
        if (index >= preorder.length) {
            return;
        }
        bstUtil(preorder, index, parentNode);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
