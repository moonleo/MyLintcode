public class Solution {
    /*
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        if(A == null || A.length == 0) {
            return 0;
        }
        int length = A.length;
        if(target > A[length - 1]) {
            return length;
        } else if(target < A[0]) {
            return 0;
        } else {
            int start = 0, end = length - 1;
            int mid;
            while(start < end) {
                mid = (start + end) / 2;
                if(target == A[mid]) {
                    return mid;
                } else if(target < A[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return A[start] < target ? start + 1: start;
        }
    }
}
