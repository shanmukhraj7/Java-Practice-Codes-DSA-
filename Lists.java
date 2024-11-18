import java.util.List;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(3, 4);
        list.set(1, 5);
        list.remove(2);
        System.out.println(list);
    
    }
}
