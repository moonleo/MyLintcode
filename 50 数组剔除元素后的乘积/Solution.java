public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        List<Long> results = new ArrayList<Long>();
        long mul;
        for(int i = 0; i < nums.size(); i ++) {
            mul = 1;
            for(int j = 0; j < nums.size(); j ++) {
                if(i != j) {
                    mul *= nums.get(j);
                }
            }
            results.add(mul);
        }
        return results;
    }
}
