/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {
    Node head;
    int count;

    public myStack() {
        // Initialize your data members
        head=null;
        count=0;
        
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return head==null;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node temp=new Node(x);
        
        temp.next=head;
        head=temp;
        
        count++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if(head==null){
            return;
        }
        
        head=head.next;
        count--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(head==null){
            return -1;
        }
        return head.data;
        
    }

    public int size() {
        // Returns the current size of the stack.
        return count;
    }
}
