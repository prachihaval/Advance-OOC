public class CustomStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public CustomStack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Push an element onto the top of the stack
    public void push(long value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Pop the top element from the stack
    public long pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Or throw an exception
        }
        return stackArray[top--];
    }

    // View the top element of the stack without removing it
    public long peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop()); // Pops 40
        System.out.println("Popped element: " + stack.pop()); // Pops 30

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}