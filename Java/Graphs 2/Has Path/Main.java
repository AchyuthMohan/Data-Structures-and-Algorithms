import java.util.*;

public class Main {
    static int v = 7;
    static ArrayList<Edge>[] graph = new ArrayList[v];
    static boolean visited[] = new boolean[v];

    static class Edge {
        int src, dest, wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph() {
        Scanner sc = new Scanner(System.in);
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

    static void displayGraph() {
        System.out.println("Graph: ");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.println("Src: " + graph[i].get(j).src + " Dest: " + graph[i].get(j).dest + " WT: "
                        + graph[i].get(j).wt);
            }
        }
    }

    static void dfs(ArrayList<Edge> graph[], boolean visited[], int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, visited, e.dest);
            }
        }
    }

    static boolean haspath(ArrayList<Edge>graph[],int s,int d,boolean visited[]){
        if(s==d){
            return true;
        }
        visited[s]=true;
        for(int i=0;i<graph[s].size();i++){
            Edge e=graph[s].get(i);
            if(!visited[e.dest] && haspath(graph, e.dest, d, visited)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        createGraph();
        System.out.println(haspath(graph, 0, 5,visited));
        // dfs(graph, visited, 0);
        // displayGraph();

    }
}
