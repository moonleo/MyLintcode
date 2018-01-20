public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if(n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        int i = 3;
        while(i <= n) {
            dp[i] = dp[i-1] + dp[i - 2];
            i ++;
        }
        return dp[n];
    }
}
