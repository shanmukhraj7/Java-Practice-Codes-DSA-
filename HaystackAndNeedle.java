public class HaystackAndNeedle {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "world";
        System.out.println(StrStr(str1, str2));
    }
    public static int StrStr(String haystack, String needle)
    {
        if(haystack.length() < needle.length()) return -1;
        for(int i=0; i<=haystack.length() - needle.length(); i++)
        {
            if(haystack.substring(i, i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}
