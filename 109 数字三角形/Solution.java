public class Solution {
    /*
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public int minimumTotal(int[][] triangle) {
        // write your code here
        if(triangle == null || triangle.length == 0) {
            return 0;
        }
        int[][] dp = new int[triangle.length][triangle[triangle.length - 1].length];
        dp[0][0] = triangle[0][0];
        int j = 0;
        for(int i = 1; i < triangle.length; i ++) {
            j = 0;
            dp[i][j] = dp[i - 1][j] + triangle[i][j];
            j ++;
            while(j < i) {
                dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                j ++;
            }
            dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < dp[0].length; i ++) {
            if(min > dp[dp.length - 1][i]) {
                min = dp[dp.length - 1][i];
            }
        }
        return min;
    }
}
