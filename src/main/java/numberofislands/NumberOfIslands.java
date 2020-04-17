package numberofislands;

/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int numOfIslands = 0;
        int numberOfRows = grid.length;
        for (int i = 0; i < numberOfRows; i++) {
            int numberOfColumns = grid[i].length;
            for (int j = 0; j < numberOfColumns; j++) {
                if (grid[i][j] != '0') {
                    islandUtil(i, j, numberOfRows, numberOfColumns, grid);
                    numOfIslands += 1;
                }
            }
        }

        return numOfIslands;
    }

    private void islandUtil(int currentRow, int currentColumn, int numberOfRows, int numberOfColumns, char[][] grid) {
        //use 0 to mark visited squares
        grid[currentRow][currentColumn] = '0';
        int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int k = 0; k < moves.length; k++) {
            int newX = moves[k][0] + currentRow;
            int newY = moves[k][1] + currentColumn;
            if (isSafe(newX, newY, numberOfRows, numberOfColumns, grid)) {
                islandUtil(newX, newY, numberOfRows, numberOfColumns, grid);
            }
        }
    }

    private boolean isSafe(int newX, int newY, int rows, int columns, char[][] grid) {
        if (newX >= 0 && newX < rows && newY >= 0 && newY < columns) {
            return grid[newX][newY] != '0';
        }
        return false;
    }
}
