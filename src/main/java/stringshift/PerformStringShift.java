package stringshift;

/*
You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift).
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.



Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation:
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
Example 2:

Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation:
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"


Constraints:

1 <= s.length <= 100
s only contains lower case English letters.
1 <= shift.length <= 100
shift[i].length == 2
0 <= shift[i][0] <= 1
0 <= shift[i][1] <= 100
 */
public class PerformStringShift {

    public String stringShift(String s, int[][] shift) {
        LinkNode startNode = createLinkedList(s);
        for (int i = 0; i < shift.length; i++) {
            boolean right = shift[i][0] == 1;
            int amount = shift[i][1];
            for (int j = 0; j < amount; j++) {
                if (right) {
                    LinkNode tempNode = startNode;
                    startNode = startNode.prev;
                    startNode.next = tempNode;
                } else {
                    LinkNode tempNode = startNode;
                    startNode = startNode.next;
                    startNode.prev = tempNode;
                }
            }
        }

        String newString = "";
        LinkNode node = startNode;
        for (int i = 0; i < s.length(); i++) {
            newString += node.character;
            node = node.next;
        }
        return newString;
    }

    private LinkNode createLinkedList(String s) {
        int lastIndex = s.length() - 1;
        LinkNode currentNode = new LinkNode(s.charAt(lastIndex));
        LinkNode lastNode = new LinkNode(s.charAt(0));
        currentNode.next = lastNode;
        lastNode.prev = currentNode;

        for (int i = lastIndex - 1; i >= 0; i--) {
            if (i == 0) {
                lastNode.next = currentNode;
                currentNode.prev = lastNode;
            } else {
                LinkNode newNode = new LinkNode(s.charAt(i));
                newNode.next = currentNode;
                currentNode.prev = newNode;
                currentNode = newNode;
            }
        }
        return lastNode;
    }

    public static class LinkNode {
        Character character;
        LinkNode next;
        LinkNode prev;

        public LinkNode(Character character) {
            this.character = character;
        }
    }

}
