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
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
            int src, dest, wt;
            System.out.println("Src: ");
            src = sc.nextInt();
            System.out.println("Dest: ");
            dest = sc.nextInt();
            System.out.println("Wt: ");
            wt = sc.nextInt();
            Edge e = new Edge(src, dest, wt);
            graph[i].add(e);
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

    static void bfs(ArrayList<Edge>graph[]) {
        Queue<Integer>q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    q.offer(graph[curr].get(i).dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        createGraph();
        // displayGraph();
        bfs(graph);
    }
}
