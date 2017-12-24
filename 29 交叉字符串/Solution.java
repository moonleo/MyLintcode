public class Solution {
    /*
     * @param s1: A string
     * @param s2: A string
     * @param s3: A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     *          for example: s1 = "abc" s2 = "efg" s3 = "aefbcg" , the result is true
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // 动态规划
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if(len3 != len1 + len2) {
            return false;
        }
        if(len1 == 0) {
            return s2.equals(s3);
        }
        if(len2 == 0) {
            return s1.equals(s3);
        }

        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        for(int i = 1; i <= len1; i ++) {
            if(dp[i-1][0] && s1.charAt(i-1) == s3.charAt(i-1))
                dp[i][0] = true;
        }

        for(int j = 1; j <= len2; j ++) {
            if(dp[0][j-1] && s2.charAt(j-1) == s3.charAt(j-1))
                dp[0][j] = true;
        }

        for(int i = 1; i <= len1; i ++) {
            for(int j = 1; j <= len2; j ++) {
                if(dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i + j - 1)) {
                    dp[i][j] = true;
                } else if(dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i + j - 1)) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[len1][len2];
    }
}
