public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min;
    /*
    * @param a: An integer
    */
    public MinStack() {
        // do intialization if necessary
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        stack.push(number);
        if(!stack.isEmpty() && number < minStack.peek()) {
            minStack.push(number);
        } else {
            minStack.push(minStack.peek());
        }
    }

    /*
     * @param a: An integer
     * @return: An integer
     */
    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    /*
     * @param a: An integer
     * @return: An integer
     */
    public int min() {
        // write your code here
        return minStack.peek();
    }
}
