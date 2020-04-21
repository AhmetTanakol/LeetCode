package binarymatrix;

import java.util.List;

public class BinaryMatrix {

    public int leftMostColumnWithOne_1(BinaryMatrixI binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int rows = dimensions.get(0);
        int columns = dimensions.get(1);

        int rowIndex = 0;
        int columnIndex = columns - 1;
        int ans = -1;
        while (rowIndex < rows && columnIndex >= columns) {

            if (binaryMatrix.get(rowIndex, columnIndex) == 0) {
                rowIndex++;
            } else {
                ans = columnIndex;
                columnIndex--;
            }
        }

        return ans;
    }

    public int leftMostColumnWithOne_2(BinaryMatrixI binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int rows = dimensions.get(0);
        int columns = dimensions.get(1);

        int low = 0;
        int high = columns - 1;
        int lastColumnIndex = -1;
        while (low <= high && low < columns) {
            int mid = (high + low) / 2;
            boolean foundOne = false;
            for (int i = 0; i < rows; i++) {
                int val = binaryMatrix.get(i, mid);
                if (val == 1) {
                    foundOne = true;
                    lastColumnIndex = mid;
                    break;
                }
            }
            if (foundOne) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return lastColumnIndex;
    }

    interface BinaryMatrixI {
        public int get(int x, int y);

        public List<Integer> dimensions();
    }
}
