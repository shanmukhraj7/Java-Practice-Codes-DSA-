import java.util.*;

public class MinTimeToBurstBallons {
    public static int minTime(int k, int[] positions) {
        // code here
         Arrays.sort(positions);
        int mt = Integer.MAX_VALUE;
        for(int i=0; i<=positions.length-k; i++){
            int s = positions[i];
            int e = positions[i+k-1];
            int t1 = Math.abs(s) + (e-s);
            int t2 = Math.abs(e) + (e-s);
            mt = Math.min(mt, Math.min(t1,t2));
        }
        return mt;
    }

    public static void main(String[] args) {
        int k=3;
        int[] positions = {-3,0,1,-2,5};
        System.out.println(minTime(k, positions));
    }
}
