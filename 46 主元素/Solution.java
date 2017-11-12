public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int count = 1;
        int majorityNumber = nums.get(0);
        for(int i = 1; i < nums.size(); i ++) {
            if(nums.get(i) == majorityNumber) {
                count ++;
            } else {
                count --;
            }
            if(count == 0) {
                majorityNumber = nums.get(i);
                count ++;
            }
        }
        return majorityNumber;
    }
}
