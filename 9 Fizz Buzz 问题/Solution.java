public class Solution {
    /*
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            results.add((i % 15 == 0)? "fizz buzz" : ((i % 5 == 0)? "buzz": ((i % 3 == 0)? "fizz": String.valueOf(i))));
        }
        return results;
    }
}
