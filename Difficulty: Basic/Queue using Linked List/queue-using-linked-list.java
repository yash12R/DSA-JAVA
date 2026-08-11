class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class myQueue {

    Node front;
    Node rear;
    int count;

    public myQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Add element at rear
    public void enqueue(int x) {

        Node newNode = new Node(x);

        if (front == null) {
            front = newNode;
            rear = newNode;
        } 
        else {
            rear.next = newNode;
            rear = newNode;
        }

        count++;
    }

    // Remove element from front
    public void dequeue() {

        if (front == null) {
            return;
        }

        front = front.next;
        count--;

        if (front == null) {
            rear = null;
        }
    }

    // Get front element
    public int getFront() {

        if (front == null) {
            return -1;
        }

        return front.data;
    }

    // Return size
    public int size() {
        return count;
    }
}