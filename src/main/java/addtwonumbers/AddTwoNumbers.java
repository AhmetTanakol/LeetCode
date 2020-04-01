package addtwonumbers;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean hasCarrying = false;
        ListNode resultNode = new ListNode(0);
        if (l1 == null) {
            l1 = new ListNode(0);
        }
        if (l2 == null) {
            l2 = new ListNode(0);
        }
        int total = l1.val + l2.val;
        if (total < 10){
            resultNode.val = total;

        } else {
            //increase the value of the next node by 1, it doesn't matter which node value is increased.
            //because the total will be always same.
            resultNode.val = total - 10;
            hasCarrying = true;
        }

        if (l1.next == null && l2.next == null) {
            if (hasCarrying) {
                resultNode.next = new ListNode(1);
            }
            return resultNode;
        }
        if (hasCarrying) {
            if (l1.next != null) {
                l1.next.val += 1;
            } else {
                l2.next.val += 1;
            }
        }
        resultNode.next = addTwoNumbers(l1.next, l2.next);
        return resultNode;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
