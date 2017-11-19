public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int[] tmp = new int[m + n];
        System.arraycopy(A, 0, tmp, 0, m + n);
        int i = 0, j = 0;
        int index = 0;
        while(i < m && j < n) {
            if(tmp[i] < B[j]) {
                A[index ++] = tmp[i];
                i ++;
            } else {
                A[index ++] = B[j];
                j ++;
            }
        }
        if(i < m) {
            for(; i < m; i ++) {
                A[index ++] = tmp[i];
            }
        } else if(j < n) {
            for(; j < n; j ++) {
                A[index ++] = B[j];
            }
        }
    }
}
