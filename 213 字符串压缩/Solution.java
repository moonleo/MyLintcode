public class Solution {
    /**
     * @param str: a string
     * @return: a compressed string
     */
    public String compress(String str) {
        // write your code here
        if(null == str || str.length() <= 2) {
            return str;
        }
        char[] arr = str.toCharArray();
        int i = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while(i < str.length()) {
            if(i == 0) {
                count = 1;
                i ++;
                continue;
            }
            if(arr[i] == arr[i-1]) {
                count ++;
            } else {
                sb.append(arr[i-1]).append(count);
                count = 1;
            }
            i ++;
        }
        sb.append(arr[i-1]).append(count);
        if(sb.toString().length() >= str.length()) {
            return str;
        }
        return sb.toString();
    }
}
