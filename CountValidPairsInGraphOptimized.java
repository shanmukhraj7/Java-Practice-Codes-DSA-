import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CountValidPairsInGraphOptimized {
    public static class Uf {
        private int[] p, s;

        public Uf(int n) {
            p = new int[n];
            s = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = i;
                s[i] = 1;
            }
        }

        public int find(int x) {
            if (p[x] != x) {
                p[x] = find(p[x]);
            }
            return p[x];
        }

        public void union(int x, int y) {
            int rX = find(x);
            int rY = find(y);

            if (rX != rY) {
                if (s[rX] < s[rY]) {
                    p[rX] = rY;
                    s[rY] += s[rX];
                } else {
                    p[rY] = rX;
                    s[rX] += s[rY];
                }
            }
        }

        public int getSize(int x) {
            return s[find(x)];
        }
    }

    public static long cntValid(int[] w) {
        int n = w.length;
        Uf uf = new Uf(n);
        Map<Integer, List<Integer>> bm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = w[i];
            for (int b = 0; b < 32; b++) {
                if ((num & (1 << b)) > 0) {
                    bm.putIfAbsent(b, new ArrayList<>());
                    bm.get(b).add(i);
                }
            }
        }
        for (List<Integer> idx : bm.values()) {
            for (int i = 1; i < idx.size(); i++) {
                uf.union(idx.get(0), idx.get(i));
            }
        }
        Map<Integer, Integer> cs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int r = uf.find(i);
            cs.put(r, cs.getOrDefault(r, 0) + 1);
        }
        long tp = 0;
        for (int size : cs.values()) {
            tp += (long) size * (size - 1) / 2;
        }
        return tp;
    }

    public static void main(String[] args) {
        int[] w1 = {1, 2, 3};
        System.out.println("Valid pairs: " + cntValid(w1));

        int[] w2 = {1, 5, 2, 10};
        System.out.println("Valid pairs: " + cntValid(w2));

        int[] w3 = {7, 14, 28, 56};
        System.out.println("Valid pairs: " + cntValid(w3));
    }
}
