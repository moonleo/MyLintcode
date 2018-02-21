public class Solution {
    /*
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        // write your code here
        if(A == null || B == null || A.length() != B.length()) {
            return false;
        }
        char[] array = A.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: array) {
            if(map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        char[] array2 = B.toCharArray();
        for(char c: array2) {
            if(map.get(c) == null) {
                return false;
            } else {
                if(map.get(c) - 1 < 0) {
                    return false;
                } else {
                    map.put(c, map.get(c) - 1);
                }
            }
        }
        return true;
    }
}
