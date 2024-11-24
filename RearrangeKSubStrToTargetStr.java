import java.util.*;

public class RearrangeKSubStrToTargetStr {
    public static boolean isPossibleToRearrange(String s, String t, int k) {
        int n = s.length();
        int pl = n/k;
        Map<String, Integer> scnt = new HashMap<>();
        for(int i=0; i<k; i++){
            String sb = s.substring(i*pl, (i+1)*pl);
            scnt.put(sb, scnt.getOrDefault(sb, 0)+1);
        }
        Map<String, Integer> tcnt = new HashMap<>();
        for(int i=0; i<k; i++){
            String sb = t.substring(i*pl, (i+1)*pl);
            tcnt.put(sb, tcnt.getOrDefault(sb, 0)+1);
        }
        return scnt.equals(tcnt);
    }
    public static void main(String[] args) {
        String  s1 = "abcd";
        String t1 = "cdab";
        int k1 = 2;
        boolean res1 = isPossibleToRearrange(s1, t1, k1);
        System.out.println(res1);

        String s2 = "aabbcc", t2 = "bbaacc";
        int k2 = 2;
        boolean res2 = isPossibleToRearrange(s2, t2, k2);
        System.out.println(res2);

        String s3 = "aabbcc", t3 = "bbaacc";
        int k3 = 3;
        boolean res3 = isPossibleToRearrange(s3, t3, k3);
        System.out.println(res3);
    }
}
