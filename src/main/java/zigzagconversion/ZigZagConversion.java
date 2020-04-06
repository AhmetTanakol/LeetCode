package zigzagconversion;


public class ZigZagConversion {

    public String convert(String s, int numRows) {
        String zigzag = "";
        String[] rows = new String[numRows];
        for(int i = 0; i < numRows; i++) {
            rows[i] = "";
        }
        int strPointer = 0;
        int rowPointer = 0;
        while(strPointer < s.length()) {
            if (rowPointer == 0) {
                while(rowPointer < numRows && strPointer < s.length()) {
                    rows[rowPointer] = rows[rowPointer] + s.charAt(strPointer);
                    rowPointer++;
                    strPointer++;
                }
                // we have go 1 row back
                // if number of row is less than 0 (1 row only), just set it to 0.
                rowPointer = Math.max(0, rowPointer - 2);
            } else {
                rows[rowPointer] = rows[rowPointer] + s.charAt(strPointer);
                rowPointer--;
                strPointer++;
            }
        }

        for (String row : rows) {
            zigzag += row;
        }

        return zigzag;
    }

}
