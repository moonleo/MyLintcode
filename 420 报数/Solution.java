public class Solution {
    /**
     * @param n: the nth
     * @return: the nth sequence
     */
    public String countAndSay(int n) {
        // write your code here
        int i = 1;
        String result = "1";
        while(i < n) {
            result = nextString(result);
            i ++;
        }
        return result;
    }

    private String nextString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int i = 1;
        char tmp = str.charAt(0);
        while(i < str.length()) {
            if(str.charAt(i) == tmp) {
                count ++;
            } else {
                sb.append(count).append(tmp);
                tmp = str.charAt(i);
                count = 1;
            }
            i ++;
        }
        sb.append(count).append(tmp);
        return sb.toString();
    }
}
