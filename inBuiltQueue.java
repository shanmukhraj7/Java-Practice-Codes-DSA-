import java.util.LinkedList;
import java.util.Queue;

public class inBuiltQueue {
    public static void main(String[] args) {
        Queue<Integer>  queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(8);
        queue.add(9);
        queue.add(2);
        

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }
    
}
