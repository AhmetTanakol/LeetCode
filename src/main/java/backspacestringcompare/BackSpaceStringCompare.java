package backspacestringcompare;

import java.util.Stack;

/*
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
Follow up:

Can you solve it in O(N) time and O(1) space?
 */
public class BackSpaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                stack1.push(S.charAt(i));
            } else {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#') {
                stack2.push(T.charAt(i));
            } else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }
        String newS = "";
        while (!stack1.isEmpty()) {
            newS += stack1.pop();
        }


        String newT = "";
        while (!stack2.isEmpty()) {
            newT += stack2.pop();
        }

        return newS.equalsIgnoreCase(newT);
    }

    public boolean backspaceCompare_2(String S, String T) {
        String newS = "";
        String newT = "";
        if (S.length() > T.length()) {
            return backspaceCompare(T, S);
        }
        int shortestArraySize = S.length();
        for (int i = 0; i < shortestArraySize; i++) {
            // For S
            if (S.charAt(i) != '#') {
                newS += S.charAt(i);
            } else {
                if (!newS.isEmpty()) {
                    newS = newS.substring(0, newS.length() - 1);
                }
            }

            // For T
            if (T.charAt(i) != '#') {
                newT += T.charAt(i);
            } else {
                if (!newT.isEmpty()) {
                    newT = newT.substring(0, newT.length() - 1);
                }
            }
        }

        for (int i = shortestArraySize; i < T.length(); i++) {
            if (T.charAt(i) != '#') {
                newT += T.charAt(i);
            } else {
                if (!newT.isEmpty()) {
                    newT = newT.substring(0, newT.length() - 1);
                }
            }
        }

        return newS.equalsIgnoreCase(newT);
    }

}
