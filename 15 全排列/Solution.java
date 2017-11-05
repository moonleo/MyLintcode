public class Solution {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
		results.add(arr2List(nums));
		func(nums, 0);
		return results;
	}

	List<List<Integer>> results = new ArrayList<List<Integer>>();

	public void func(int[] nums, int start) {
		if (start > nums.length - 1) {
			return;
		}
		int[] tmp = new int[nums.length];
		for (int i = start + 1; i < nums.length; i++) {
			System.arraycopy(nums, 0, tmp, 0, nums.length);
			swap(tmp, start, i);
			func(tmp, start + 1);
			results.add(arr2List(tmp));
		}
		func(nums, start + 1);
	}

	public void print(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

	public List<Integer> arr2List(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i: nums) {
			list.add(i);
		}
		return list;
	}

}
