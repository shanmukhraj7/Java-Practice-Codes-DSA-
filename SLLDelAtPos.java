import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class SLLDelAtPos {
   Node head;
    SLLDelAtPos()
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

    public void deleteAtPos(int pos)
    {
       Node current = head;                    
       if(pos <= 0 || head == null)
        {
            System.out.println("Out of bounds");
        }

        if(pos == 1)
        {
            head = current.next;
            return;
        }

        for(int i=1; current!=null && i<pos-1; i++)
        {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SLLDelAtPos list = new SLLDelAtPos();
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
        System.out.print("Enter the position to delete: ");
        int pos = sc.nextInt();
        list.deleteAtPos(pos);
        System.out.print("Linked List After Deletion:  ");
        list.display();
        sc.close();
    }
}


/*Two pointer
 * 
 * ListNode fast = head;
 * ListNode slow = head;
 * ListNode prev = null;
 * 
 * while(fast != null && fast.next != null)
 * {
 *      fast = fast.next.next;
 *      prev = slow;
 *      slow = slow.next;
 * }
 * 
 * if(prev != null)
 * {
 *      prev.next = slow.next;
 * }
 * 
 * 
 * return head;
 * 
 * 
*/



