import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class LinkedListPos {
    Node head;
    LinkedListPos()
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

        }

    public void insertAtPos(int newData, int pos)
    {
        Node newNode = new Node(newData);

        if(pos == 1)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int currentPosition = 1;
        while(current != null && currentPosition < pos-1)
        {
            current  = current.next;
            currentPosition++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void display()
        {
            Node current = head;
            while(current != null)
            {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            LinkedListPos list = new LinkedListPos();
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
            int positon = sc.nextInt();
            list.insertAtPos(val, positon);
            System.out.print("After inserting the elements in and Linked list: ");
            list.display();
            sc.close();
        }
    
}
