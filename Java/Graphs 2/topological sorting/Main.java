import java.util.*;

public class Main {
    static int v = 6;
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
            graph[i] = new ArrayList<Edge>();
        }
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

    }

    static void topSort(ArrayList<Edge>[]graph){
        boolean visited[]=new boolean[graph.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                topSortUtil(graph, visited, i,s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
static void topSortUtil(ArrayList<Edge>[]graph,boolean visited[],int curr,Stack<Integer>s){
    visited[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(!visited[e.dest]){
            topSortUtil(graph, visited, e.dest,s);
        }
    }
    s.push(curr);
}
    public static void main(String[] args) {
        createGraph(graph);
        topSort(graph);
    }
}
