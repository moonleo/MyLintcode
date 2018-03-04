public class Solution {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if(n <= 2) {
            return n - 1;
        }
        int a = 0, b = 1;
        int result = 0;
        int i = 2;
        while(i < n) {
            result = a + b;
            a = b;
            b = result;
            i ++;
        }
        return result;
    }
}
