public class nTo1 {
    public static void main(String[] args) {
        num(5);
    }

    public static void num(int num) {
        if (num == 0) {
            return;
        }
        num(num - 1);
        System.out.println(num);
    }

}
