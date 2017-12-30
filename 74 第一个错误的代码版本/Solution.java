/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether
 * the kth code version is bad or not.
*/

public class Solution {
    /*
     * @param n: An integer
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        if(n <= 1) {
            return n;
        }
        if(SVNRepo.isBadVersion(1)) {
            return 1;
        }
        if(!SVNRepo.isBadVersion(n - 1)) {
            return n;
        }
        return binarySearch(1, n);
    }

    public int binarySearch(int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if(!SVNRepo.isBadVersion(mid)) {
            return binarySearch(mid + 1, end);
        } else {
            if(mid > 0) {
                if(!SVNRepo.isBadVersion(mid - 1))
                    return mid;
                else {
                    return binarySearch(start, mid - 1);
                }
            } else {
                return mid;
            }
        }
    }
}
