class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {

        return binarySearch(nums, 0, nums.length-1, target);
    }

    public int binarySearch(int[] nums, int low, int high, int target) {
        if(low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if(nums[mid] == target) {
            if(mid == 0 || nums[mid - 1] != target){
                return mid;
            } else {
                return binarySearch(nums, low, mid - 1, target);
            }
        } else if(nums[mid] > target) {
            return binarySearch(nums, low, mid - 1, target);
        } else {
            return binarySearch(nums, mid + 1, high, target);
        }
    }
}
