import java.util.*;
import java.util.LinkedList;

public class Main {
    static int v = 6;
    static ArrayList<Edge>[] graph = new ArrayList[v];

    static class Edge {
        int src, dest, wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph() {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 0));
        graph[1].add(new Edge(1, 2, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));
        graph[4].add(new Edge(4, 5, 0));
    }

    static void bfs(ArrayList<Edge>[] graph) {
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                bfsUtil(graph, visited,i);
            }
        }
    }

    static void bfsUtil(ArrayList<Edge>[]graph,boolean visited[],int s){
        Queue<Integer>q=new LinkedList<>();
        q.offer(s);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.offer(e.dest);
                }
            }
        }
    }

    static void displayGraph() {
        System.out.println("Graph: ");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.println("Src: " + graph[i].get(j).src + " Dest: " + graph[i].get(j).dest + " WT: "
                        + graph[i].get(j).wt);
            }
        }
    }

    public static void main(String[] args) {
        createGraph();
        // displayGraph();
        bfs(graph);
    }
}
