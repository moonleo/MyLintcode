public class Solution {
    /*
     * @param nums: a list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int m = 0, n = 0;
        int m_count = 0, n_count = 0;
        for(int i: nums) {
            if (m_count == 0 || i == m) {
                m = i;
                m_count ++;
            } else if (n_count == 0 || i == n) {
                n = i;
                n_count ++;
            } else {
                n_count --;
                m_count --;
            }
        }
        m_count = 0;
        n_count = 0;
        for(int i: nums) {
            if(i == m) {
                m_count ++;
            } else if(i == n) {
                n_count ++;
            }
        }
        return m_count > n_count ? m : n;
    }
}
