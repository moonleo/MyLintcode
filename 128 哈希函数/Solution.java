public class Solution {
    /*
     * @param key: A string you should hash
     * @param HASH_SIZE: An integer
     * @return: An integer
     */
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        long sum = (long)(key[0] - 'a' + 97);
        for(int i = 1; i < key.length; i ++) {
            sum = (sum * 33) % HASH_SIZE + (long)(key[i] - 'a' + 97);
        }
        return (int)(sum % HASH_SIZE);
    }
}
