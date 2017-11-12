public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        /*贪心算法*/
        int result = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            result = (sum > result) ? sum : result;
            if(sum < 0) {
                sum = 0;
            }
        }
        return result;
    }
}
