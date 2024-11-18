import java.util.Scanner;

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public class LinkedList
    {
        Node head;
       public LinkedList()
        {
            head = null;
        }

        // public void insertAtBeg(int newData) //Insert from begining
        // {
        //     Node newNode = new Node(newData);
        //     newNode.next = head;
        //     head = newNode;
        // }

        public void insertAtEnd(int newData) // Insert from ending
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

        


        public void display()
        {
            Node current = head;
            int sum = 0;
            while(current != null)
            {
                sum+=current.data;
                current = current.next;
            }
            System.out.println(sum);
            System.out.println();
        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the numbmer of elements: ");
            int n = sc.nextInt();
            for(int i=0; i<n; i++)
            {
                System.out.print("Enter the elmeents "+ (i+1)+ ": ");
                int value = sc.nextInt();
                list.insertAtEnd(value);
            }
            // System.out.print("After inserting the elements in Linked list: ");
            list.display();
            sc.close();
        }

        
    }

