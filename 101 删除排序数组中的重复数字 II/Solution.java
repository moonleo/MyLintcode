public class Solution {
    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0;
        int count = 1;
        for(int i = 1; i < nums.length; i ++) {
            if(nums[i] == nums[p]) {
                count ++;
            } else {
                count = count > 2 ? 2 : count;
                for(int j = 1; j < count; j ++) {
                    nums[p + j] = nums[p];
                }
                p = count + p;
                nums[p] = nums[i];
                count = 1;
            }
        }
        //数组最后出现连续相同的数字
        count = count > 2 ? 2 : count;
        while(count > 1) {
            nums[p + 1] = nums[p];
            p ++;
            count --;
        }

        return p + 1;
    }
}
