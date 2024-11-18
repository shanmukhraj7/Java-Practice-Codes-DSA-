import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "aabbcc";
        String str2 = "abcabc";
        System.out.println(areAnagaram(str1, str2));
    }

    public static boolean areAnagaram(String s1, String s2) {
        String str1 = s1.replaceAll("\\s+", " ").toLowerCase();
        String str2 = s2.replaceAll("\\s+"," ").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
