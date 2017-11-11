public class Solution {
    /*
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        /*类似快排的思想*/
        if(null == nums|| nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = nums.length - 1;
        while(i < j && i < nums.length && j >= 0) {
            while(j >= 0 && nums[j] >= k) {
                j --;
            }
            while(i < nums.length && nums[i] < k) {
                i ++;
            }
            if(i < j) {
                swap(nums, i, j);
            }
        }
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
