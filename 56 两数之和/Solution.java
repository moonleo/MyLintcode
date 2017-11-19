public class Solution {
    /*
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] indexs = new int[2];
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        List<Integer> list;
        for(int i = 0; i < numbers.length; i ++) {
            if(map.get(numbers[i]) == null) {
                list = new ArrayList<Integer>();
                list.add(i + 1);
                map.put(numbers[i], list);
            } else {
                map.get(numbers[i]).add(i + 1);
            }
        }
        for(int i = 0; i < numbers.length; i ++) {
            list = map.get(target - numbers[i]);
            if(list != null) {
                for(int j: list) {
                    if(j != i + 1) {
                        indexs[0] = min(j, i + 1);
                        indexs[1] = max(j, i + 1);
                        break;
                    }
                }
            }
        }
        return indexs;
    }

    private int min(int a, int b) {
        return a > b ? b : a;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
