public class Solution {
    /*
     * @param chars: The letter array you should sort by Case
     * @return: nothing
     */
    public void sortLetters(char[] chars) {
        // write your code here
        List<Character> list = new ArrayList<Character>();
        for(char c: chars) {
            list.add(c);
        }
        Collections.sort(list, new MyComparator());
        for(int i = 0; i < list.size(); i ++) {
            chars[i] = list.get(i);
        }
    }

    class MyComparator implements Comparator<Character> {
        public int compare(Character c1, Character c2) {
            if(c1 > c2) {
                return -1;
            } else if(c1 < c2) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
