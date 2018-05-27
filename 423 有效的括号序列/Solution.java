public class Solution {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        char c, top;
        while(i < s.length()) {
            c = s.charAt(i);
            if( c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                top = stack.peek();
                if((c == ')' && top != '(')
                ||(c == ']' && top != '[')
                ||(c == '{' && top != '}')){
                    return false;
                } else {
                    stack.pop();
                }
            }
            i ++;
        }
        return stack.isEmpty();
    }
}
