public class Solution {
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // write your code here
        if(digits == null || digits.length == 0) {
            return digits;
        }
        int carry = 1;
        int length = digits.length;
        int sum = 0;
        for(int i = length - 1; i >= 0; i --) {
            sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry != 0) {
            int[] result = new int[length + 1];
            result[0] = carry;
            for(int i = 0; i < length; i ++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
