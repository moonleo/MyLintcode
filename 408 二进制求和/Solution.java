public class Solution {
    /**
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        // write your code here
        int[] array = new int[(a.length()>b.length()?a.length():b.length()) + 1];
        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        int length = array.length - 1;
        int carry = 0, sum = 0;
        while(lengthA >= 0 && lengthB >= 0) {
            sum = Integer.parseInt(a.charAt(lengthA)+"")
                      + Integer.parseInt(b.charAt(lengthB)+"")
                      + carry;
            array[length] = sum % 2;
            carry = sum / 2;
            lengthA --;
            lengthB --;
            length --;
        }
        while(lengthA >= 0) {
            sum = Integer.parseInt(a.charAt(lengthA)+"") + carry;
            array[length] = sum % 2;
            carry = sum / 2;
            lengthA --;
            length --;
        }
        while(lengthB >= 0) {
            sum = Integer.parseInt(b.charAt(lengthB)+"") + carry;
            array[length] = sum % 2;
            carry = sum / 2;
            lengthB --;
            length --;
        }
        array[length] = carry;
        int i = (array[0] == 0? 1 : 0);
        StringBuilder sb = new StringBuilder();
        for(;i < array.length; i ++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
}
