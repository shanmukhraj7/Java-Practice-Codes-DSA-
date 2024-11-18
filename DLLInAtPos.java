import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        this.next=null;
        this.prev=null;
    }
}


public class DLLInAtPos {
    Node head;
    DLLInAtPos()
    {
        head = null;
    }
    
    public void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);
        
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void insertatPosition(int newData, int position)
    {
        Node newNode = new Node(newData);
        if (head == null && position == 1) {
            head = newNode;
            return;
        } else if (head == null) {
            System.out.println("Invalid position for empty list");
            return;
        }
        Node current = head;
        int currentPos = 1;
        while(current != null && currentPos < position-1)
        {
            current = current.next;
            currentPos++;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        if(current.next == null)
        {
            current.next = newNode;
            newNode.prev = current;
        }
        else{
            newNode.next = current.next;
            current.next = newNode;
            newNode.prev = current;
            newNode.next.prev = newNode;
        }
    }

    public void display()
        {
            if(head == null)
            {
                System.out.println("List is empty");
                return;
            }

            Node current = head;
            while(current != null)
            {
                System.out.print(current.data +"->");
                current = current.next;
            }
            System.out.print("null");
        }
    public static void main(String[] args) {
        DLLInAtPos list = new DLLInAtPos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbmer of elements: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the elments "+ (i+1)+ ": ");
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }
        System.out.print("Enter the element to insert: ");
        int val = sc.nextInt();
        System.out.print("Enter the positon: ");
        int position = sc.nextInt();
        list.insertatPosition(val,position);
        System.out.print("After inserting the elements in and Linked list: ");
        list.display();
        sc.close();

    }
    
}
