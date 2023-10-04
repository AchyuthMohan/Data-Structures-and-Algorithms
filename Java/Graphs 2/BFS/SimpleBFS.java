import java.util.*;

public class SimpleBFS {
    static void bfs(int adj[][],boolean visited[],int start,List<Integer>res){
        Queue<Integer>q=new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int temp=q.poll();
                if(!visited[temp]){
                    visited[temp]=true;
                    res.add(temp);
                    for(int j=0;j<adj[temp].length;j++){
                        if(!visited[j] && adj[temp][i]==1){
                            q.offer(j);
                        }
                    }
                }
            }
        }
    }
    static void bfsUtil(int adj[][],List<Integer>res){
        boolean visited[]=new boolean[adj.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                bfs(adj, visited, i, res);
            }
        }
    }
    public static void main(String[] args) {
        int adj[][]=new int[6][6];
        adj[1][2]=1;
        adj[2][1]=1;
        adj[1][3]=1;
        adj[3][1]=1;
        adj[4][2]=1;
        adj[2][4]=1;
        adj[5][2]=1;
        adj[2][5]=1;
        List<Integer>res=new ArrayList<>();
        bfsUtil(adj, res);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
