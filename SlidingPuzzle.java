
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.LinkedList;

public class SlidingPuzzle {
    public static int slidingPuzzle(int[][] board) {
        int[][] dir = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        String target = "123450";
        String ini = Arrays.stream(board)
                           .flatMapToInt(Arrays::stream)
                           .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                           .toString();
        
        Set<String> v = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(ini);
        v.add(ini);
        int cnt=0;
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz-- > 0){
                String curr = q.poll();
                if(curr.equals(target)) return cnt;
                int zpos = curr.indexOf('0');
                for(int nzpos : dir[zpos]){
                    String nxt = swap(curr, zpos, nzpos);
                    if(v.contains(nxt)) continue;
                    v.add(nxt);
                    q.add(nxt);
                }
            }
            cnt++;
        }
        return -1;
    }

    static String swap(String s, int l, int r){
        char[] c = s.toCharArray();
        char temp = c[l];
        c[l] = c[r];
        c[r] = temp;
        return new String(c); 
    }

    public static void main(String[] args) {
        int[][] board1 = {{1,2,3},{4,0,5}};
        System.out.println(slidingPuzzle(board1));

        int[][] board2 = {{4,1,2},{5,0,3}};
        System.out.println(slidingPuzzle(board2));
    }
}
