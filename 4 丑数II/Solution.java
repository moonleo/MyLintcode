public class Solution {
    /*
     * @param n: An integer
     * @return: the nth prime number as description.
     */
    public int nthUglyNumber(int n) {
        // write your code here
        /*每个丑数都是2、3或5的倍数，第n个丑数一定是前面某个数的2倍、3倍或者5倍，
        只需要依次将第1~n-1个丑数分别乘以2、3、5，找到比第n-1个丑数大的最小的那个
        ，就是第n个丑数*/
        if(n == 1)
            return 1;
        int[] result = new int[n];
        result[0] = 1;
        //
        int index_2 = 0, index_3 = 0, index_5 = 0;
        int i = 1;
        int tmp;
        while(i < n) {
            tmp = min(result[index_2]*2, result[index_3]*3, result[index_5]*5);
            if(tmp/result[index_2] == 2)
                index_2 ++;
            if(tmp/result[index_3] == 3)
                index_3 ++;
            if(tmp/result[index_5] == 5)
                index_5 ++;
            result[i] = tmp;
            i ++;
        }
        return result[n-1];
    }

    public int min(int a, int b, int c) {
        int d = a > b ? b : a;
        return d > c ? c : d;
    }
}
