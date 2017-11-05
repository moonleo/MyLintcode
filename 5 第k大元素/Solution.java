class Solution {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        return quickSortKth(nums, 0, nums.length - 1, k);
    }

    public int quickSortKth(int[] nums, int low, int high, int k) {
        int tmp = nums[low];
        int i = low, j = high;
        while(i < j) {
            while(nums[j] < tmp && i < j) {
                j --;
            }
            nums[i] = nums[j];
            while(nums[i] > tmp && i < j ) {
                i ++;
            }
            nums[j] = nums[i];
        }
        nums[i] = tmp;
        if(i == k - 1) {
            return nums[i];
        } else if(i > k - 1) {
            return quickSortKth(nums, low, i, k);
        } else {
            return quickSortKth(nums, i+1 , high, k);
        }
    }
};
