public class Solution {

    /*
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        List<Integer> item;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i ++) {
            item = new ArrayList<Integer>();
            dfs(nums, 0, i, item);
        }
        item = new ArrayList<Integer>();
        for(int i: nums) {
            item.add(i);
        }
        result.add(item);
        return result;
    }
    
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    private void dfs(int[] nums, int start, int size, List<Integer> item) {
        if(item.size() == size) {
            result.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = start; i < nums.length; i ++) {
            item.add(nums[i]);
            dfs(nums, i+1, size, item);
            item.remove(item.size()-1);
        }
    }
}
