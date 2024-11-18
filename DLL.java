import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int d)
    {
        data = d;
        next = null;
        prev = null;
    }
}

public class DLL {
    Node head;
    DLL()
    {
        head = null;
    }

    // void insertAtBeg(int newData)  //InsertAtStart
    // {
    //     Node newNode = new Node(newData);

    //     if(head == null)
    //     {
    //         head = newNode;
    //     }
    //     else
    //     {
    //         newNode.next = head;
    //         head.prev = newNode;
    //         head = newNode;
    //     }
    // }


    void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);

        if(head == null)
        {
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    
    
    void display()
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
        DLL list = new DLL();
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the elements "+(i+1)+" : ");
            int val = sc.nextInt();
            list.insertAtEnd(val);
        }
        System.out.print("Double Linked List after insertion: ");
        list.display();
        sc.close();
    }
    
}
