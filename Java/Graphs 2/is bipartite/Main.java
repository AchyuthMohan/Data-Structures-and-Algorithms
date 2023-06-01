import java.util.*;

import javax.swing.plaf.synth.ColorType;

public class Main {
    static int v = 5;
    static ArrayList<Edge>[] graph = new ArrayList[v];

    static class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    static boolean isBipartite(ArrayList<Edge> graph[]) {
        int color[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                color[i] = 0;
                q.offer(i);
                while (!q.isEmpty()) {
                    int curr = q.poll();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (color[e.dest] == -1) {
                            if (color[curr] == 0) {
                                color[e.dest] = 1;
                            } else {
                                color[e.dest] = 0;
                            }
                        } else {
                            if (color[e.dest] == color[curr]) {
                                return false;
                            }
                        }
                        q.offer(e.dest);
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}