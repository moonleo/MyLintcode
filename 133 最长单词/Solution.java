public class Solution {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        List<String> result = new ArrayList<>();
        int maxLength = 0;
        for(String s: dictionary) {
            if(s.length() > maxLength) {
                result.clear();
                result.add(s);
                maxLength = s.length();
            } else if(s.length() == maxLength) {
                result.add(s);
            }
        }
        return result;
    }
}
