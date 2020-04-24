package bitwiseandnumbersrange;

public class BitwiseAnd {

    public int rangeBitwiseAnd(int m, int n) {
        int numberOfShifts = 0;
        while (n != m) {
            n = n >> 1;
            m = m >> 1;
            numberOfShifts++;
        }
        return m << numberOfShifts;
    }

}
