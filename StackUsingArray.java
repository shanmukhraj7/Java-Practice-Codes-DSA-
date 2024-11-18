
import java.util.Scanner;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackUsingArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Method to add an element to the stack (Push operation)
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Unable to add " + item);
            return;
        }
        stack[++top] = item;
        System.out.println(item + " pushed to the stack.");
    }

    // Method to remove an element from the stack (Pop operation)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        return stack[top--];
    }

    // Method to return the top element without removing it (Peek operation)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        StackUsingArray stack = new StackUsingArray(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;

                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;

                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element is: " + topElement);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
