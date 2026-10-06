// Custom class to handle basic Stack operations (LIFO)
public class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    
    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1; 
    }

    // 1. Push element onto the top of the stack
    public boolean push(int value) {
        if (isFull()) {
            System.out.println("[Error] Stack Overflow! Cannot push " + value);
            return false;
        }
        top++;
        stack[top] = value;
        System.out.println("[Success] Pushed to stack: " + value);
        return true;
    }

    // 2. Pop element from the top of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("[Error] Stack Underflow! Stack is empty.");
            return -1;
        }
        int poppedValue = stack[top];
        top--;
        System.out.println("[Success] Popped from stack: " + poppedValue);
        return poppedValue;
    }

    // 3. Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("[Error] Stack is empty! No element to peek.");
            return -1;
        }
        System.out.println("[Info] Top element is: " + stack[top]);
        return stack[top];
    }

    // 4. Display all stack elements from top to bottom
    public void display() {
        if (isEmpty()) {
            System.out.println("[Info] Stack is empty.");
            return;
        }
        System.out.print("Stack (Top to Bottom): [ ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + (i > 0 ? ", " : " "));
        }
        System.out.println("]");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}