public class Solution {
    /*
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if(x <= 1) {
            return x;
        }
        long start = 1;
        long end = x;
        long mid = 0;
        while(start < end) {
            mid = (start + end) / 2;
            if(mid * mid == (long)x) {
                return (int)mid;
            } else if(mid * mid < (long)x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(start * start > (long)x)
            return (int)(start - 1);
        else
            return (int)start;
    }
}
