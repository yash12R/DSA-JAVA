class myQueue {

    int arr[];
    int front;
    int rear;
    int size;

    // Constructor
    myQueue(int n) {
        arr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == arr.length;
    }

    // Insert element
    public void enqueue(int x) {
        if (isFull()) {
            return;
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = x;
        size++;
    }

    // Remove element
    public void dequeue() {
        if (isEmpty()) {
            return;
        }

        front = (front + 1) % arr.length;
        size--;
    }

    // Get front element
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    // Get rear element
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return arr[rear];
    }
}