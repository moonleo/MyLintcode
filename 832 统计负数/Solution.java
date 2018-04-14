public class Solution {
    int count = 0;

    /**
     * @param nums: the sorted matrix
     * @return: the number of Negative Number
     */
    public int countNumber(int[][] nums) {
        // Write your code here
        if(count > 0) {
            return count;
        }
        count = 0;
        for(int i = 0; i < nums.length; i ++) {
            for(int j = 0; j < nums[0].length; j ++) {
                if(nums[i][j] < 0) {
                    count ++;
                }
            }
        }
        return count;
    }
}
