class Solution {
    boolean[][] seen;
    public int numIslands(char[][] grid) {
        seen = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                char currElement = grid[i][j];
                if (currElement == '1' && !seen[i][j]) {
                    seen[i][j] = true;
                    dfs(i, j, grid);
                    ans++;
                }
            }
        }

        return ans;
    }

    private boolean isValid(int i, int j, char[][] grid) {
        return i < grid.length && i >= 0 && j < grid[0].length && j >= 0;

    }
    private void dfs(int i, int j, char[][] grid) {
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int[] direction : directions) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];
            if (isValid(newRow, newCol, grid) && !seen[newRow][newCol] && grid[newRow][newCol] == '1') {
                seen[newRow][newCol] = true;
                dfs(newRow, newCol, grid);
            }
        }
        return;
    }
}
