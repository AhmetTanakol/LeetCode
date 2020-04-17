package numberofislands;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    private NumberOfIslands numberOfIslands;

    @Before
    public void setUp() {
        numberOfIslands = new NumberOfIslands();
    }

    @Test
    public void numIslands_1() {
        char[][] grid = {{'0', '0'}, {'1', '1'}};
        int result = numberOfIslands.numIslands(grid);

        assertEquals(1, result);
    }

    @Test
    public void numIslands_2() {
        char[][] grid = {{'1', '0'}, {'0', '0'}};
        int result = numberOfIslands.numIslands(grid);

        assertEquals(1, result);
    }

    @Test
    public void numIslands_3() {
        char[][] grid = {{'0', '1'}, {'1', '0'}};
        int result = numberOfIslands.numIslands(grid);

        assertEquals(2, result);
    }

    @Test
    public void numIslands_4() {
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int result = numberOfIslands.numIslands(grid);

        assertEquals(1, result);
    }

    @Test
    public void numIslands_5() {
        char[][] grid = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        int result = numberOfIslands.numIslands(grid);

        assertEquals(3, result);
    }
}
