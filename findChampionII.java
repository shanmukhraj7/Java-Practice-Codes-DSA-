public class findChampionII {
    public static int findChampion(int n, int[][] edges) {
        int[] InDegree = new int[n];
        for(int[] edge : edges){
            InDegree[edge[1]]++;
        }
        int startPoint = 0, champion =- 1;
        for(int i=0; i<n; i++){
            if(InDegree[i] == 0){
                startPoint++;
                champion=i;
            }
        }
        return startPoint == 1 ? champion : -1;
    }
    
    public static void main(String[] args) {
        int n1 = 3;
        int[][] edges1 = {{0,1},{1,2}};
        System.out.println(findChampion(n1, edges1));
        int n2 = 4;
        int[][] edges2 = {{0,2},{1,3},{1,2}};
        System.out.println(findChampion(n2, edges2));
    }
}
