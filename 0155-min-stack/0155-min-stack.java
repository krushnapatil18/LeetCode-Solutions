import java.util.Stack;

class MinStack {

    private final Stack<Integer> mainSt;
    private final Stack<Integer> minSt;

    public MinStack() {
        mainSt = new Stack<>();
        minSt  = new Stack<>();
    }
    
    public void push(int val) {
        mainSt.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }
    
    public void pop() {
        if (mainSt.peek().equals(minSt.peek())) {
            minSt.pop();
        }
        mainSt.pop();
    }
    
    public int top() {
        return mainSt.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}

/*
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
