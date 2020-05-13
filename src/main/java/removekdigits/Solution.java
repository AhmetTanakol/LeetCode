package removekdigits;

import java.util.Stack;

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
