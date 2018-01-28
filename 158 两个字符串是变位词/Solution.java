public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        if(s == null || t == null) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: s.toCharArray()) {
            if(map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        int tmp;
        for(char c: t.toCharArray()) {
            if(map.get(c) == null) {
                return false;
            }
            tmp = map.get(c);
            if(tmp - 1 < 0) {
                return false;
            } else {
                map.put(c, tmp - 1);
            }
        }
        return true;
    }
};
