import java.util.Queue;

public class NumberOfProvines {

    public static int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for(int i = 0; i<n; i++) {
            if(!vis[i]) {
                count++;
                bfs(i, vis, adj);
            }
        }

        return count;
    }

    private static void bfs(int i, boolean[] vis, int[][] adj) {
        int n = adj.length;
        vis[i] = true;
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(i);
        while (q.size() > 0) {
            int front = q.remove();
            for(int j = 0; j<n; j++) {
                if(adj[front][j] == 1 && !vis[j]) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }





    public static void main(String[] args) {
        
    }
}
