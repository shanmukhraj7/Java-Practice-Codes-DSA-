import java.util.*;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int longestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0, start = 0;
        for(int end=0; end<s.length(); end++){
            char ch = s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String str = sc.nextLine();
        System.out.println(longestSubstring(str));
        sc.close();
    }
}
