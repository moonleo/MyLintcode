public class Solution {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        // Write your code here
        char[] flag = new char[26];
        for(char c: str.toCharArray()) {
            flag[c - 'a'] ++;
        }
        for(char c: str.toCharArray()) {
            if(flag[c - 'a'] == 1) {
                return c;
            }
        }
        return ' ';
    }
}
