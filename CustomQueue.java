// Custom class to handle basic Queue operations (FIFO)
public class CustomQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    
    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // 1. Enqueue element to the end of the queue
    public boolean enqueue(int value) {
        if (isFull()) {
            System.out.println("[Error] Queue Overflow! Cannot enqueue " + value);
            return false;
        }
        rear++;
        queue[rear] = value;
        size++;
        System.out.println("[Success] Enqueued to queue: " + value);
        return true;
    }

    // 2. Dequeue element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("[Error] Queue Underflow! Queue is empty.");
            return -1;
        }
        int removedValue = queue[front];
        front++;
        size--;

        
        if (size == 0) {
            front = 0;
            rear = -1;
        }

        System.out.println("[Success] Dequeued from queue: " + removedValue);
        return removedValue;
    }

    // 3. Peek at the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("[Error] Queue is empty! No element at front.");
            return -1;
        }
        System.out.println("[Info] Front element is: " + queue[front]);
        return queue[front];
    }

    // 4. Display all queue elements from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("[Info] Queue is empty.");
            return;
        }
        System.out.print("Queue (Front to Rear): [ ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + (i < rear ? ", " : " "));
        }
        System.out.println("]");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}