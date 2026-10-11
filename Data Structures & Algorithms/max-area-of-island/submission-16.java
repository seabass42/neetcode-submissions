class Solution {
    boolean[][] seen;
    public int maxAreaOfIsland(int[][] grid) {
        seen = new boolean[grid.length][grid[0].length];
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!seen[i][j] && grid[i][j] == 1) {
                    seen[i][j] = true;
                    ans = Math.max(ans, dfs(i, j, grid));
                }
            }
        }

        return ans;
    }

    private boolean isValid(int i, int j, int[][] grid) {
        return i < grid.length && i >= 0 && j < grid[0].length && j >= 0;
    }

    private int dfs(int i, int j, int[][] grid) {
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int size = 1;
        for (int[] direction : directions) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];
            if (isValid(newRow, newCol, grid) && !seen[newRow][newCol] && grid[newRow][newCol] == 1) {
                seen[newRow][newCol] = true;
                size += dfs(newRow, newCol, grid);
            }
        }
        return size;
    }
}
