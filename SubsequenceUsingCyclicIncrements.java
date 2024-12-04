public class SubsequenceUsingCyclicIncrements {
    public static boolean canMakeSubsequence(String str1, String str2){
        int m = str1.length(), n = str2.length();
        if(n > m) return false;
        int j=0;
        for(int i=0; i<m && j<n; i++){
            char cu = str1.charAt(i);
            char nx = (char) ((cu - 'a' + 1)%26 + 'a');
            if(cu == str2.charAt(j) || nx == str2.charAt(j)){
                j++;
                if(j == n) break;
            }
        }
        return j == n;
    }
    
    public static void main(String[] args) {
        String str1 = "abc", str2 = "ad";
        System.out.println(canMakeSubsequence(str1, str2));

        String str3 = "zc", str4 = "ad";
        System.out.println(canMakeSubsequence(str3, str4));

        String str5 = "ab", str6 = "d";
        System.out.println(canMakeSubsequence(str5, str6));
    }
}
