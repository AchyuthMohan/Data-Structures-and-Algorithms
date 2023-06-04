import java.util.*;

public class Main {
    static int v = 6;
    static ArrayList<Edge>[] graph = new ArrayList[v];

    static class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.dest = dest;
            this.src = src;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
    }

    static void dfs(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {

            }
        }
    }

    static void dfsUtil(ArrayList<Edge>[] graph, boolean visited[], int curr) {
        visited[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfsUtil(graph, visited, e.dest);
            }
        }
    }

    public static void main(String[] args) {
        createGraph(graph);
        dfs(graph);
    }
}