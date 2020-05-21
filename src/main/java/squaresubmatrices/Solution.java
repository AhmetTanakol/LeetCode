package squaresubmatrices;

/*
Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.


Example 1:

Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation:
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.
Example 2:

Input: matrix =
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
Output: 7
Explanation:
There are 6 squares of side 1.
There is 1 square of side 2.
Total number of squares = 6 + 1 = 7.


Constraints:

1 <= arr.length <= 300
1 <= arr[0].length <= 300
0 <= arr[i][j] <= 1
 */
class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        int rows = matrix.length;
        int columns = matrix[rows - 1].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    int bigSquare = Math.min(matrixValue(i - 1, j - 1, matrix),
                            Math.min(matrixValue(i - 1, j, matrix),
                                    matrixValue(i, j - 1, matrix))) + matrix[i][j];
                    matrix[i][j] = bigSquare;
                    if (bigSquare > 1) {
                        count += bigSquare;
                    } else {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private int matrixValue(int i, int j, int[][] matrix) {
        if (i >= 0 && j >= 0) {
            return matrix[i][j];
        }
        return 0;
    }
}
