import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BFS {

    // Edge class
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    // BFS
    public static void bfs(ArrayList<Edge>[] graph, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];

        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS (FIXED)
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // ⭐ IMPORTANT CHECK
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }


    // PrintAllPaths (NOT USED)
    public static void printAllPath(ArrayList<Edge> graph, boolean vis[], int curr, String path, int tar) {
        if(curr == tar) {
            System.out.println(path);
            return;
        }

        for(int i = 0; i < graph.size(); i++) {
            Edge e = graph.get(i);

            if(!vis[e.dest]) {
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, path + e.dest, tar);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        System.out.print("DFS: ");
        boolean[] vis = new boolean[V];
        dfs(graph, 0, vis);

        System.out.println();

        System.out.print("BFS: ");
        bfs(graph, V);


        int src = 0, tar = 5;
        
    }
}
