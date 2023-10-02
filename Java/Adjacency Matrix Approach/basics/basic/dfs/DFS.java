import java.util.*;
class Graph {
    int n;
    int adjacency[][];

    Graph(int n) {
        this.n = n;
        this.adjacency = new int[n][n];
    }

    void addEdge(int src, int dest, int wt) {
        adjacency[src][dest] = wt;
        adjacency[dest][src] = wt;
    }

    void removeEdge(int src, int dest) {
        adjacency[src][dest] = 0;
        adjacency[dest][src] = 0;
    }

    void display() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(adjacency[i][j] + " ");
            }
            System.out.println();
        }
    }
    void dfs(int start){
        boolean visited[]=new boolean[n];
        Stack<Integer>stack=new Stack<>();
        visited[start]=true;
        stack.push(start);
        System.out.println(start+" ");
        while(!stack.isEmpty()){
            int vertex=stack.peek();
            int nextNeighbor=getNextNeighbour(vertex, visited);
            if(nextNeighbor==-1){
                stack.pop();
            }
            else{
                System.out.print(nextNeighbor+" ");
                visited[nextNeighbor]=true;
                stack.push(nextNeighbor);
            }
        }
    }
    int getNextNeighbour(int vertex,boolean visited[]){
        for(int i=0;i<n;i++){
            if(adjacency[vertex][i]==1 && !visited[i]){
                return i;
            }
        }
        return -1;
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1, 1);
        g.addEdge(0, 2, 1);
        g.addEdge(2, 3, 1);
        g.display();
        System.out.println("DFS: ");
        g.dfs(1);
    }
}