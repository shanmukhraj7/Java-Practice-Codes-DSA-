import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    Node top;
    StackLinkedList()
    {
        top = null;
    }

    public void push(int value)
    {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(("Pushed "+value+" on to the stack"));
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty, nothing to pop");
            return -1;
        }
        else
        {
            int popValue = top.data;
            top = top.next;
            System.out.println("Popped "+popValue+" value from the stack");
            return popValue;
        }
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty, nothing to peek");
            return -1;
        }
        else
        {
            return top.data;
        }
    }

    public boolean isEmpty()
    {
        return (top==null);
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty.");
        }
        else
        {
            Node current = top;
            System.out.print("Elemnts in Stack: ");
            while(current != null)
            {
                System.out.print(current.data +" ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinkedList myStack = new StackLinkedList();
        System.out.print("No. of opetrations: ");
        int ops = sc.nextInt();
        for(int i=0; i<ops; i++)
        {
            System.out.println("choose the operations: 1=push, 2=pop, 3=peek, 4=display");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter the value: ");
                    int value = sc.nextInt();
                    myStack.push(value);
                    break;

                case 2:
                    myStack.pop();
                    break;

                case 3:
                    System.out.println("Top element is: "+myStack.peek());
                    break;

                case 4:
                    myStack.display();
                    break;
                    
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        sc.close();
    }
    
}
