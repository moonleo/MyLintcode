public class Solution {
    /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        // write your code here
        int tmp = 1;
        int count = 0;
        while(tmp != 0) {
            if((tmp & num) != 0) {
                count ++;
            }
            tmp = tmp << 1;
        }
        return count;
    }
};
