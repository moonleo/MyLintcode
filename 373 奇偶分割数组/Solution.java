public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here
        if(nums == null || nums.length <= 1) {
            return ;
        }
        int pre = 0, post = nums.length - 1;
        int length = nums.length;
        while(pre < post) {
            while(pre < post && nums[pre] % 2 != 0) {
                pre ++;
            }
            while(pre < post && nums[post] % 2 == 0) {
                post --;
            }
            if(pre < post) {
                swap(nums, pre, post);
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
