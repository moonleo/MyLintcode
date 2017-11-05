public class Solution {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 0..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int count = (k == 0) ? 1: 0;
        int i = 0;
        int tmp;
        while(i <= n) {
            tmp = i;
            while(tmp != 0) {
                count += (tmp % 10 == k)? 1 : 0;
                tmp = tmp /10;
            }
            i ++;
        }
        return count;
    }
};
