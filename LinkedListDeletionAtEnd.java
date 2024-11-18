import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        data =d;
        next = null;
    }
}

public class LinkedListDeletionAtEnd {
    Node head;
    LinkedListDeletionAtEnd()
    {
        head = null;
    }

    void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);
        
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node current  = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    void deleteAtEnd()
    {
        if (head.next == null)
        {
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next != null)
        {
            current = current.next;
        }
        current.next = null;
    }

    void display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListDeletionAtEnd list = new LinkedListDeletionAtEnd();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbmer of elements: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the elments "+ (i+1)+ ": ");
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }
        System.out.print("Linked List Before Deletion: ");
        list.display();
        list.deleteAtEnd();
        System.out.println();
        System.out.print("Linked List After Deletion:  ");
        list.display();
        sc.close();
        
    }

    



}
