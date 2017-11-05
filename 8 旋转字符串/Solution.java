public class Solution {
    /*
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if(offset == 0 || str == null || str.length == 0) return;
        offset = offset % str.length;
        reverseStringRange(str, 0, str.length - 1 - offset);
        reverseStringRange(str, str.length - offset, str.length - 1);
        reverseStringRange(str, 0, str.length - 1);
    }

    public void reverseStringRange(char[] str, int i, int j) {
        char tmp;
        int ii = i, jj = j;
        while(ii < jj) {
            tmp = str[ii];
            str[ii] = str[jj];
            str[jj] = tmp;
            ii ++;
            jj --;
        }
    }
}
