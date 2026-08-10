class myStack {
    int[] st;
    int top=-1;

    public myStack(int n) {
        // Define Data Structures
         st = new int[n];
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top==-1;
        
    }

    public boolean isFull() {
        // check if the stack is full
        return top==st.length-1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(isFull())
        return;
        
        top++;
        st[top]=x;
    }

    public void pop() {
        // Removes an element from the top of the stack
    
       if(isEmpty())
       return;
       
       top--;
        
    }

    public int peek() {
        // Returns the top element of the stack
        if(isEmpty())
        return -1;
        
        return st[top];
    }
}