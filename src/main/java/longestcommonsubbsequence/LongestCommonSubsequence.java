package longestcommonsubbsequence;

import java.util.LinkedList;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0) {
            return 0;
        }
        int rows = text1.length();
        int columns = text2.length();
        int[][] matrix = new int[rows + 1][columns + 1];
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
                }
            }
        }


        return matrix[rows][columns];
    }

}
