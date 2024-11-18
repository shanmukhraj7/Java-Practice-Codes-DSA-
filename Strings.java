public class Strings {
    public static void main(String[] args) {
        String string1 = "Hello World!";
        String string2 = "Hello World!";
        String ss = string1.substring(0, string1.length());
        System.out.println(ss);
        int len = string1.length();
        System.out.println(len);
        string1.compareTo(string2);
        System.out.println(string1.equals(string2));
        String s3 = string1.replace('!', '?');
        System.out.println(s3);
    }
}
