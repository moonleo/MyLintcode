public class Solution {
    /*
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if(A == null) {
            return false;
        }
        char[] arr = A.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: arr) {
            if(map.get(c) != null) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        char[] arrB = B.toCharArray();
        for(char c: arrB) {
            if(map.get(c) != null && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
