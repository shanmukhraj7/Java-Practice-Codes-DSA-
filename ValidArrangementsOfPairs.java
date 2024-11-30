import java.util.*;

public  class ValidArrangementsOfPairs {
    public static int[][] validArrangement(int[][] pairs) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        Map<Integer, Integer> in = new HashMap<>();
        Map<Integer, Integer> out = new HashMap<>();
        for (int[] pair : pairs) {
            adj.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
            in.put(pair[1], in.getOrDefault(pair[1], 0) + 1);
            out.put(pair[0], out.getOrDefault(pair[0], 0) + 1);
        }
        int start = -1;
        for (int node : adj.keySet()) {
            if (out.getOrDefault(node, 0) - in.getOrDefault(node, 0) == 1) {
                start = node;
                break;
            }
        }
        if (start == -1) {
            start = pairs[0][0];
        }
        List<int[]> ans = new ArrayList<>();
        dfs(start, adj, ans);
        Collections.reverse(ans);
        return ans.toArray(new int[ans.size()][]);
    }

    private static void dfs(int node, Map<Integer, List<Integer>> adj, List<int[]> ans) {
        List<Integer> neighbors = adj.get(node);
        while (neighbors != null && !neighbors.isEmpty()) {
            int next = neighbors.remove(neighbors.size() - 1);
            dfs(next, adj, ans); 
            ans.add(new int[]{node, next});
        }
    }

    public static void main(String[] args) {
        int[][] pairs = {{5, 1}, {4, 5}, {11, 9}, {9, 4}};
        int[][] result = validArrangement(pairs);
        System.out.println(Arrays.deepToString(result));
    }
    
}
