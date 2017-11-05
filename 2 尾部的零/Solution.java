public class Solution {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        //long twosCount = 0;
        long count = 0;
        for(int i=1; Math.pow(5, i) <= n; i ++) {
            count += n/(long)Math.pow(5, i);
        }
        return count;
    }
}
