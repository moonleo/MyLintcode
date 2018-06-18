public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] dp = new int[row][column];
        for(int i = 0; i < row; i ++) {
            for(int j = 0; j < column; j ++) {
                dp[i][j] = -1;
            }
        }
        for(int i = 0; i < row; i ++) {
            if(obstacleGrid[i][0] != 0 || (i > 0 && dp[i-1][0] == 0)) {
                dp[i][0] = 0;
            } else {
                dp[i][0] = 1;
            }
        }
        for(int j = 0; j < column; j ++) {
            if(obstacleGrid[0][j] != 0 || (j > 0 && dp[0][j-1] == 0)) {
                dp[0][j] = 0;
            } else {
                dp[0][j] = 1;
            }
        }
        for(int i = 1; i < row; i ++) {
            for(int j = 1; j < column; j ++) {
                if(obstacleGrid[i][j] != 0) {
                    dp[i][j] = 0;
                } else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[row-1][column-1];
    }
}
