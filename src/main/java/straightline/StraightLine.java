package straightline;


/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

Example 1:

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true


Example 2:

Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false


Constraints:

2 <= coordinates.length <= 1000
coordinates[i].length == 2
-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
coordinates contains no duplicate point.
 */
public class StraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] firstPoint = coordinates[0];
        int[] lastPoint = coordinates[coordinates.length - 1];
        int dividend = lastPoint[1] - firstPoint[1];
        int divisor = lastPoint[0] - firstPoint[0];
        double slope = divisor == 0 ? (double) 0 : (double) (dividend / divisor);
        double constant = (double) firstPoint[1] - (slope * firstPoint[0]);

        for (int i = 1; i < coordinates.length; i++) {
            double ypoint = (slope * coordinates[i][0]) + constant;
            if (ypoint != (double) coordinates[i][1]) {
                return false;
            }
        }

        return true;
    }
}
