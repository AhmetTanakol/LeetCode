package removekdigits;

import java.util.Stack;

/*
Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

Note:
The length of num is less than 10002 and will be ≥ k.
The given num does not contain any leading zero.
Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */
class Solution {

    public String removeKdigits(String num, int k) {
        if (num.length() <= k) {
            return "0";
        }

        int count = 0;
        Stack<Character> s = new Stack<>();

        for (char c : num.toCharArray()) {
            while (!s.isEmpty() && count < k && s.peek() > c) {
                count++;
                s.pop();
            }
            s.add(c);
        }

        while (!s.isEmpty() && count < k) {
            count++;
            s.pop();
        }

        if (s.isEmpty()) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        sb = sb.reverse();
        int zeros = 0;
        for (char c : sb.toString().toCharArray()) {
            if (c != '0') break;
            zeros++;
        }
        if (sb.length() == zeros) return "0";
        return sb.toString().substring(zeros);
    }

}
