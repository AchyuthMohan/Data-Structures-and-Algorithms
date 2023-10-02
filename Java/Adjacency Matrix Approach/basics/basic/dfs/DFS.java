import java.util.*;

public class DFS {
    static void dfs(ArrayList<Integer> res, int adj[][], int start) {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[adj.length];
        stack.push(start);
        visited[start] = true;
        res.add(start);
        while (!stack.isEmpty()) {
            int temp = stack.peek();
            int nextNeighbour = getNextNeighbour(adj, temp, visited);
            if (nextNeighbour == -1) {
                stack.pop();
            } else {
                res.add(nextNeighbour);
                stack.push(nextNeighbour);
                visited[nextNeighbour] = true;
            }
        }
    }

    static int getNextNeighbour(int adj[][], int vertex, boolean visited[]) {
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i] && adj[vertex][i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int adj[][] = new int[9][9];
        adj[1][2] = 1;
        adj[2][1] = 1;
        adj[1][3] = 1;
        adj[3][1] = 1;
        adj[2][3] = 1;
        adj[3][2] = 1;
        adj[4][2] = 1;
        adj[2][4] = 1;
        adj[4][5] = 1;
        adj[5][4] = 1;
        adj[5][7] = 1;
        adj[7][5] = 1;
        adj[6][7] = 1;
        adj[7][6] = 1;
        adj[6][8] = 1;
        adj[8][6] = 1;
        adj[1][6] = 1;
        adj[6][1] = 1;

        ArrayList<Integer> res = new ArrayList<>();
        dfs(res, adj, 1);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}