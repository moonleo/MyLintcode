public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if(null == s || s.length() == 0) {
            return true;
        }
        String tmp = s.toLowerCase();
        char[] arr = tmp.toCharArray();
        int i = 0, j = tmp.length() - 1;
        while(i < j) {
            while(i < arr.length && !isValidChar(arr[i])  ) {
                i ++;
            }
            while(j >= 0 && !isValidChar(arr[j])) {
                j --;
            }
            if(i < arr.length && j >= 0 && arr[i] != arr[j]) {
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }

    private boolean isValidChar(char a) {
        return (a <= 'z' && a >= 'a') || (a >= '0' && a <= '9');
    }
}
