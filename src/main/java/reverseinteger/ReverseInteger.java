package reverseinteger;

public class ReverseInteger {
    public int reverse(int x) {
        int num = Math.abs(x);
        long newNum = 0;
        while(num > 0) {
            newNum = newNum * 10 + num % 10;
            if(newNum > Integer.MAX_VALUE) {
                return 0;
            }
            num /= 10;
        }
        if(x < 0) {
            newNum *= -1;
        }
        return (int) newNum;
    }
}
