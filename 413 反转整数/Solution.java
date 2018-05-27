public class Solution {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public int reverseInteger(int n) {
        // write your code here
        String num = String.valueOf(n);
        boolean isNegative = false;
        if(num.charAt(0) == '-') {
            isNegative = true;
            num = num.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = num.length()-1; i >=0; i --) {
            sb.append(num.charAt(i));
        }
        String r = sb.toString();
        if(isNegative && !isOverFlowNegative(r)) {
            return -Integer.parseInt(r);
        } else if(!isNegative && !isOverFlowPositive(r)){
            return Integer.parseInt(r);
        } else {
            return 0;
        }
    }

    private boolean isOverFlowNegative(String num) {
        return isBigger(num, String.valueOf(Integer.MAX_VALUE));
    }

    private boolean isOverFlowPositive(String num) {
        String min = String.valueOf(Integer.MIN_VALUE);
        min = min.substring(1);
        return isBigger(num, min);
    }

    private boolean isBigger(String a, String b) {
        if(a.length() > b.length()) {
            return true;
        } else if(a.length() < b.length()) {
            return false;
        } else {
            int length = a.length();
            for(int i = 0; i < length; i ++) {
                if(a.charAt(i) > b.charAt(i)) {
                    return true;
                }
            }
            return false;
        }

    }
}
