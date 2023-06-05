import java.util.*;
public class Main {
    static int v = 7;
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
        graph[0].add(new Edge(0, 2, 0));
        graph[1].add(new Edge(1, 3, 0));
        graph[2].add(new Edge(2, 4, 0));
        graph[3].add(new Edge(3, 5, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[4].add(new Edge(4, 5, 0));
        graph[5].add(new Edge(5, 6, 0));
    }
    static void paths(ArrayList<Edge>[]graph,int s, int d,ArrayList<Integer>path){
        if(s==d){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
        }
        for(int i=0;i<graph[s].size();i++){
            Edge e=graph[s].get(i);
            path.add(e.dest);
            paths(graph, e.dest, d, path);
        }
    }
    
    public static void main(String[] args) {
        createGraph();
        ArrayList<Integer>path=new ArrayList<>();
        paths(graph, 0, 5, path);
    }
}
