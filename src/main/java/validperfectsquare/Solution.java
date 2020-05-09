package validperfectsquare;

/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long low = 1;
        long high = num;
        while (low <= high) {
            long mid = ((high + low) / 2l);
            long square = mid * mid;
            if (square == (long) num) {
                return true;
            } else if (square > (long) num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
