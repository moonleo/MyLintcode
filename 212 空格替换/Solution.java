public class Solution {
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // write your code here
        if(string == null || length == 0) {
            return 0;
        }
        int tmp = length;
        for(int i = 0; i < length; i ++) {
            if(string[i] == ' ') {
                tmp += 2;
            }
        }
        int index = tmp - 1;
        for(int i = length - 1; i >= 0; i --) {
            if(string[i] == ' ') {
                string[index] = '0';
                index --;
                string[index] = '2';
                index --;
                string[index] = '%';
                index --;
            } else {
                string[index] = string[i];
                index --;
            }
        }
        return tmp;
    }
}
