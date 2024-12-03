public class AddSpaces{
    public static String addSpaces(String s, int[] spaces){
        StringBuilder res = new StringBuilder();
        int n = spaces.length, m = s.length();
        int j = 0;
        for(int i=0; i<m; i++){
            if(j<n && i == spaces[j]){
                res.append(" ");
                j++;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s1 = "LeetcodeHelpsMeLearn";
        int[] spaces1 = {8,13,15};
        System.out.println(addSpaces(s1, spaces1));

        String s2 = "icodeinjava";
        int[] spaces2 = {1,5,7};
        System.out.println(addSpaces(s2, spaces2));
    }
}