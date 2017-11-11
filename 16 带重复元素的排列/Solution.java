public class Solution {
    /*
     * @param :  A list of integers
     * @return: A list of unique permutations
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
        /*在全排列的基础上，在将每个排列结果添加到最终列表中时，增加一个判断，看是否已经在列表中了*/
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
		List<Integer> list;
		for (int i = start + 1; i < nums.length; i++) {
			System.arraycopy(nums, 0, tmp, 0, nums.length);
			swap(tmp, start, i);
			func(tmp, start + 1);
			list = arr2List(tmp);
			if(!contains(results, list)) {
			    results.add(list);
			}
		}
		func(nums, start + 1);
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

	public boolean contains(List<List<Integer>> results, List<Integer> list) {
	    Map<Integer, Integer> map;
	    for(List<Integer> tmp: results) {
	        if(sameList(tmp, list)) {
	            return true;
	        }
	    }
	    return false;
	}

	public boolean sameList(List<Integer> listA, List<Integer> listB) {
	    boolean equalFlag = true;
	    for(int i=0; i< listA.size(); i ++) {
	        if(listA.get(i) != listB.get(i)) {
	            equalFlag = false;
	            break;
	        }
	    }
	    return equalFlag;
	}
};
