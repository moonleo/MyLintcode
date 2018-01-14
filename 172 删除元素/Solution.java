public class Solution {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if(A == null || A.length == 0)
            return 0;
        int p = 0;
        int q = p;
        while(q < A.length && A[q] == elem) {
            q ++;
        }
        while(q < A.length) {
            if(q < A.length) {
                A[p] = A[q];
            }
            p ++;
            q ++;
            while(q < A.length && A[q] == elem) {
                q ++;
            }
        }
        return p;
    }
}
