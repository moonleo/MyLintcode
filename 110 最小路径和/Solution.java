public class Solution {
    /*
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // 动态规划
        int heigth = grid.length;

        int width = grid[0].length;

        int[][] dp = new int[heigth][width];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < width; i ++) {
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }
        for(int j = 1; j < heigth; j ++) {
            dp[j][0] = grid[j][0] + dp[j-1][0];
        }
        for(int i = 1; i < heigth; i ++) {
            for(int j = 1; j < width; j ++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[heigth - 1][width - 1];
    }
}
