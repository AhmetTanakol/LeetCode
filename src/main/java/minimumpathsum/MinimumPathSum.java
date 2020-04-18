package minimumpathsum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinimumPathSum {

    // to store visited squares
    private Set<String> visitedSquares = new HashSet<>();
    // to store summation of paths
    private HashMap<String, Integer> map = new HashMap<>();

    // start from the last square
    public int minPathSum(int[][] grid) {
        int rows = grid.length - 1;
        int columns = grid[rows].length - 1;
        String key = keyGenerator(rows, columns);
        //mark current square as visited
        visitedSquares.add(key);
        return pathUtil(rows, columns, rows, columns, grid);
    }

    private int pathUtil(int currentX, int currentY, int rows, int columns, int[][] grid) {
        //stop if we reach to the first element of the grid
        //remove from visited squares because we need to come to this point from other paths.
        //Example: We can go to (0,0) from (0,1) or (1,0). If you come from (0,1) and do not set (0,0) as visited,
        //then you cannot reach this point from (1,0)
        if (currentX == 0 && currentY == 0) {
            String key = keyGenerator(currentX, currentY);
            visitedSquares.remove(key);
            return grid[currentX][currentY];
        }
        //Even there are 4 different moves(left, right, top, bottom) only left and top moves can be tried
        //In the end we start from bottom right corner, and we try to reach top left corner.
        //This will also reduce the number of operations.
        int[][] moves = {{-1, 0}, {0, -1}};
        Integer minOfCurrentIteration = null;
        for (int i = 0; i < moves.length; i++) {
            int xMove = moves[i][0] + currentX;
            int yMove = moves[i][1] + currentY;
            //Check if it is a valid move or not
            if (isSafe(xMove, yMove, rows, columns)) {
                //Set sqaure as visited
                String key = keyGenerator(currentX, currentY);
                visitedSquares.add(key);
                String key2 = String.format("%d_%d_%d_%d", currentX, currentY, xMove, yMove);
                int sum;
                //Here to eliminate duplicate operations, I stored the total sum of the path
                //If you follow a path for which you already found the sum just get it from the map, no need to calculate it again
                if (!map.containsKey(key2)) {
                    sum = grid[currentX][currentY] + pathUtil(xMove, yMove, rows, columns, grid);
                    map.putIfAbsent(key2, sum);
                } else {
                    sum = map.get(key2);
                }
                //For each move set the min sum
                if (minOfCurrentIteration == null) {
                    minOfCurrentIteration = sum;
                } else {
                    minOfCurrentIteration = Math.min(minOfCurrentIteration, sum);
                }
                //Current move is over, mark it as unvisited so that you can come to this point again
                visitedSquares.remove(key);
            }
        }

        return minOfCurrentIteration;
    }

    private boolean isSafe(int xMove, int yMove, int rows, int columns) {
        String key = keyGenerator(xMove, yMove);
        if (xMove >= 0 && xMove <= rows && yMove >= 0 && yMove <= columns && !visitedSquares.contains(key)) {
            return true;
        }

        return false;
    }

    private String keyGenerator(int x, int y) {
        return String.format("%d_%d", x, y);
    }

}
