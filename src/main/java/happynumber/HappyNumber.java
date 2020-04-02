package happynumber;

/*
A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
public class HappyNumber {

    // Floyd's detection algorithm
    // Fast variable doubles the speed of slow variable
    // At some point fast variable will catch slow variable if there is a cycle
    // In this case, slow should have value 1, since fast variable already has this value. We should return true
    // Otherwise return false;
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        int slow = n;
        int fast = sumOfSquares(n);
        while(slow != fast) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int sumOfSquares(int n) {
        int result = 0;
        while(n > 0) {
            int leastSignificantDigits = n % 10;
            result += (leastSignificantDigits * leastSignificantDigits);
            n /= 10;
        }

        return result;
    }
}
