package floodfill;

import java.util.HashSet;
import java.util.Set;

/*
An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.

Example 1:
Input:
image = [[1,1,1],[1,1,0],[1,0,1]]
sr = 1, sc = 1, newColor = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation:
From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected
by a path of the same color as the starting pixel are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected
to the starting pixel.
Note:

The length of image and image[0] will be in the range [1, 50].
The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < image[0].length.
The value of each color in image[i][j] and newColor will be an integer in [0, 65535].
 */
class Solution {
    private Set<String> visited = new HashSet<>();
    private int currentColor = -1;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image.length == 0) {
            return image;
        }
        int rows = image.length;
        int columns = image[rows - 1].length;
        currentColor = image[sr][sc];
        floodUtil(sr, sc, newColor, rows, columns, image);

        return image;
    }

    private void floodUtil(int currentX, int currentY, int newColor, int rows, int columns, int[][] image) {
        image[currentX][currentY] = newColor;
        visited.add(createKey(currentX, currentY));
        int[][] moves = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        for (int[] move : moves) {
            int newX = currentX + move[0];
            int newY = currentY + move[1];
            if (isSafe(newX, newY, rows, columns, image)) {
                floodUtil(newX, newY, newColor, rows, columns, image);
            }
        }

        return;
    }

    private boolean isSafe(int newX, int newY, int rows, int columns, int[][] image) {
        String key = createKey(newX, newY);
        if (newX >= 0 && newX < rows && newY >= 0 && newY < columns && !visited.contains(key)) {
            if (image[newX][newY] == currentColor) {
                return true;
            }
        }
        return false;
    }

    private String createKey(int x, int y) {
        return String.format("%d_%d", x, y);
    }
}
