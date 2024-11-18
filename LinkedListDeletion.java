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


public class LinkedListDeletion {
    Node head;
    LinkedListDeletion()
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


    public void deleteAtStart()
    {
        if(head == null)
        {
            return;
        }

        head = head.next;
    }


    public void display()
    {
        Node current  = head;
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        while(current != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        LinkedListDeletion list = new LinkedListDeletion();
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
        list.deleteAtStart();
        System.out.print("Linked List After Deletion:  ");
        list.display();
        sc.close();
    }


    
}
