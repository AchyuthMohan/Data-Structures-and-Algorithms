class Graph {
    int n;
    int adjacency[][];

    Graph(int n) {
        this.n = n;
        this.adjacency = new int[n][n];
    }

    void addEdge(int src, int dest,int wt) {
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
}

public class Weighted {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1,1);
        g.addEdge(0, 2,2);
        g.addEdge(1, 3,1);
        g.addEdge(2, 4,5);
        g.display();
        g.removeEdge(0,2);
        System.out.println("Graph after removal of edge: ");
        g.display();
    }
}