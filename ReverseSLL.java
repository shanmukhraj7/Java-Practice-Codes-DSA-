import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}

public class ReverseSLL {
    Node head;
    ReverseSLL()
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

    public void Reverse()
    {
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        ReverseSLL list = new ReverseSLL();
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the elements "+(i+1)+" : ");
            int val = sc.nextInt();
            list.insertAtEnd(val);
        }
        System.out.print("Before reversing the linked list: ");
        list.display();
        System.out.println();
        list.Reverse();
        System.out.print("After reversing the linked list: ");
        list.display();
        sc.close();
    }
    
}
