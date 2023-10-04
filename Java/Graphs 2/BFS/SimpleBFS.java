import java.util.*;

public class SimpleBFS {
    static void bfs(int start, int adj[][], List<Integer> res,boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int temp = q.poll();
                if (!visited[temp]) {
                    res.add(temp);
                    visited[temp] = true;
                }
                for (int j = 0; j < adj[i].length; j++) {
                    if (!visited[j] && adj[i][j] == 1) {
                        q.offer(j);
                    }
                }
            }

        }
    }
    static void bfsUtil(int adj[][],List<Integer>res){
        boolean visited[]=new boolean[adj.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                bfs(i, adj, res,visited);
            }
        }
    }

    public static void main(String[] args) {
        int adj[][] = new int[5][5];
        adj[0][1] = 1;
        adj[0][2] = 1;
        adj[0][3] = 1;
        adj[0][4] = 1;
        adj[1][0] = 1;
        adj[2][0] = 1;
        adj[3][0] = 1;
        adj[4][0] = 1;
        List<Integer> res = new ArrayList<>();
        bfsUtil(adj, res);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
