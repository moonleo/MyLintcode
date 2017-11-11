public class Solution {
    /*
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        if(nums != null && nums.size() > 1) {
            int index = findRotatedIndex(nums);
            if(index != nums.size()) {
                Integer tmp;
                while(index > 0) {
                    nums.add(nums.remove(0));
                    index --;
                }
            }
        }
    }
    /**
    找到旋转点索引，即相邻的两个元素。后面比前面的元素要大的位置
    */
    private int findRotatedIndex(List<Integer> nums) {
        for(int i=1; i < nums.size(); i++) {
            if(nums.get(i) < nums.get(i-1)) {
                return i;
            }
        }
        return nums.size();
    }
}
