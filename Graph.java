import java.util.*;

public class Graph {
    private final int n; // number of vertices
    private final List<List<Integer>> adj;

    public Graph(int n) {
        this.n = n; adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        // for undirected graphs also add: adj.get(v).add(u);
    }

    public List<Integer> bfs(int src) {
        boolean[] vis = new boolean[n];
        List<Integer> order = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src); vis[src] = true;
        while (!q.isEmpty()) {
            int u = q.poll(); order.add(u);
            for (int v : adj.get(u)) if (!vis[v]) { vis[v] = true; q.add(v); }
        }
        return order;
    }

    public List<Integer> dfs(int src) {
        boolean[] vis = new boolean[n];
        List<Integer> order = new ArrayList<>();
        dfsRec(src, vis, order);
        return order;
    }

    private void dfsRec(int u, boolean[] vis, List<Integer> order) {
        vis[u] = true; order.add(u);
        for (int v : adj.get(u)) if (!vis[v]) dfsRec(v, vis, order);
    }
}