public class IslandCount {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
        };

        System.out.println("Number of islands: " + countIslands(grid));
    }

    public static int countIslands(int[][] grid) {
        int count = 0;
        int numRows = grid.length;
        if (numRows == 0) {
            return count;
        }
        int numCols = grid[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    markAdjacentAsVisited(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void markAdjacentAsVisited(int[][] grid, int i, int j) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        if (i < 0 || i >= numRows || j < 0 || j >= numCols || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0; 

        markAdjacentAsVisited(grid, i + 1, j); 
        markAdjacentAsVisited(grid, i - 1, j); 
        markAdjacentAsVisited(grid, i, j + 1); 
        markAdjacentAsVisited(grid, i, j - 1); 
    }
}