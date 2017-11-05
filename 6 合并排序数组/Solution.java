public class Solution {
    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        if(null == A || A.length == 0) {
            return B;
        }
        if(null == B || B.length == 0) {
            return A;
        }
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while(i < A.length && j < B.length) {
            if(A[i] < B[j]) {
                C[k] = A[i];
                i ++;
            } else if(A[i] > B[j]) {
                C[k] = B[j];
                j ++;
            } else {
                C[k] = A[i];
                i ++;
                k ++;
                C[k] = B[j];
                j ++;
            }
            k ++;
        }
        int[] tmp = (i == A.length)? B: A;
        int a = (i == A.length) ? j:i;
        for(;a < tmp.length; a++) {
            C[k] = tmp[a];
            k ++;
        }
        return C;
    }
}
