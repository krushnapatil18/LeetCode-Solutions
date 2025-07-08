class MyStack {
    Queue<Integer> que1;
    Queue<Integer> que2;

    public MyStack() {
        que1 = new LinkedList();
        que2 = new LinkedList();
    }
    
    public void push(int x) {
        while(!que2.isEmpty()){
            que1.add(que2.poll());
        }
        que2.add(x);
        while(!que1.isEmpty()){
        que2.add(que1.poll());
        }

    }
    
    public int pop() {
        return que2.poll();
    }
    
    public int top() {
        return que2.peek();
        
    }
    
    public boolean empty() {
        return que2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */