package numbercomplement;

class Solution {
    public int findComplement(int num) {
        /*int numberOfShifts = Integer.toBinaryString(num).length();
        String newNum = Integer.toBinaryString(~num).substring(32 - numberOfShifts, 32);

        return Integer.parseInt(newNum, 2);*/
        int cp = num;
        int sum = 0;
        while (num > 0) {
            sum = (sum << 1) + 1;
            System.out.println("Sum: " + sum);
            num >>= 1;
            System.out.println("Num: " + num);
        }
        return sum - cp;

    }
}
