class MinStack {
    Stack<Long>st=new Stack<>();
    long min;

    public MinStack() {
        
    }
    
    public void push(int value) {
        if(st.empty()){
            min=value;
            st.push((long)value);
        }
        else if(value>=min){
            st.push((long)value);
            
        }
        else{
            st.push(2L * value-min);
            min=value;
        }
        
    }
    
    public void pop() {
        if(st.empty())
        return;

        long n=st.peek();
        st.pop();

        if(n<min){
            min=2*min-n;
        }
        
    }
    
    public int top() {

        if(st.empty())
        return -1;

        long n=st.peek();

        if(n<min)
        return(int)min;

        return (int)n;
        
    }
    
    public int getMin() {

        return (int)min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */