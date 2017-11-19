public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        if(s == null || s.length() == 0) {
            return s;
        }
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder(arr[0]);
        for(int i = 1; i < arr.length; i ++) {
            sb.insert(0, arr[i]+" ");
        }
        return sb.toString();
    }
}
