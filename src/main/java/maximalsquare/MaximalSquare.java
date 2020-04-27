package maximalsquare;

public class MaximalSquare {

    private int maxArea = 0;

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return maxArea;
        }
        int rows = matrix.length;
        int columns = matrix[rows - 1].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != '0') {
                    maximalSquareUtil(1, i, j, rows, columns, matrix);
                }
            }
        }

        return maxArea;
    }

    public int maximalSquare_2(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return 0;
        int max = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == '1') {
                dp[i][0] = 1;
                max = 1;
            }
        }
        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == '1') {
                dp[0][i] = 1;
                max = 1;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;
    }

    private void maximalSquareUtil(int level, int currentX, int currentY, int rows, int columns, char[][] matrix) {
        maxArea = Math.max(maxArea, 1);

        int leftMove = currentY - 1;
        int numberOfLeftMoves = 0;
        int counter = 0;
        while (counter < level && isSafe(currentX, leftMove, rows, columns, matrix)) {
            leftMove--;
            numberOfLeftMoves++;
            counter++;
        }

        counter = 0;
        int upMove = currentX - 1;
        int numberOfUpMoves = 0;
        while (counter < level && isSafe(upMove, currentY, rows, columns, matrix)) {
            upMove--;
            numberOfUpMoves++;
            counter++;
        }

        counter = 0;
        int diagonalXMove = currentX - 1;
        int diagonalYMove = currentY - 1;
        int numberOfDiagonalMoves = 0;
        while (counter < level && isSafe(diagonalXMove, diagonalYMove, rows, columns, matrix)) {
            leftMove--;
            numberOfDiagonalMoves++;
            counter++;
        }

        // move diagonal
        if (numberOfLeftMoves == numberOfUpMoves
                && numberOfUpMoves == numberOfDiagonalMoves
                && numberOfLeftMoves != 0
                && numberOfUpMoves != 0
                && numberOfDiagonalMoves != 0) {
            int area = (level + 1) * (level + 1);
            maxArea = Math.max(maxArea, area);
            int nextX = currentX + 1;
            int nextY = currentY + 1;
            if (isSafe(nextX, nextY, rows, columns, matrix)) {
                level++;
                maximalSquareUtil(level, nextX, nextY, rows, columns, matrix);
            }
        }

    }

    private boolean isSafe(int xMove, int yMove, int rows, int columns, char[][] matrix) {
        if (xMove >= 0 && xMove < rows && yMove >= 0 && yMove < columns) {
            return matrix[xMove][yMove] != '0';
        }

        return false;
    }
}
