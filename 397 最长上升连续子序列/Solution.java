public class Solution {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if(A == null || A.length == 0) {
            return 0;
        }
        int len = A.length;
        int max = 1;
        int[] dp = new int[len];
        dp[0] = 1;
        for(int i = 1; i < len; i ++) {
            if(A[i] > A[i-1]) {
                dp[i] = dp[i-1] + 1;
                max = dp[i] > max ? dp[i] : max;
            } else {
                dp[i] = 1;
            }
        }
        dp = new int[len];
        dp[0] = 1;
        for(int i = 1; i < len; i ++) {
            if(A[i] < A[i-1]) {
                dp[i] = dp[i-1] + 1;
                max = dp[i] > max ? dp[i] : max;
            } else {
                dp[i] = 1;
            }
        }
        return max;
    }
}
