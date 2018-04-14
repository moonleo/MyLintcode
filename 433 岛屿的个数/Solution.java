public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    public int numIslands(boolean[][] grid) {
        // write your code here
        if(grid == null || grid.length == 0) {
            return 0;
        }
        boolean[][] flag = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[0].length; j ++) {
                if(!flag[i][j] && grid[i][j]) {
                    count ++;
                    func(i, j, flag, grid);
                }
            }
        }
        return count;
    }

    int count = 0;

    private void func(int i, int j, boolean[][] flag, boolean[][] grid) {
        if(isParamIllegal(i, -1, grid.length) && isParamIllegal(j, -1, grid[0].length)) {
            if(!flag[i][j] && grid[i][j]) {
                flag[i][j] = true;
                func(i - 1, j, flag, grid);
                func(i + 1, j, flag, grid);
                func(i, j - 1, flag, grid);
                func(i, j + 1, flag, grid);
            }
        }
    }

    private boolean isParamIllegal(int i, int min, int max) {
        return i > min && i < max;
    }
}
