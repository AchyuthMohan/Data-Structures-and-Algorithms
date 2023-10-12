import java.util.*;

public class SimpleBFS {
    static void bfs(int adj[][],boolean visited[],List<Integer>res,int start){
        Queue<Integer>q=new LinkedList<>(); 
        if(!visited[start]){
            q.offer(start);
            while(!q.isEmpty()){
                int size=q.size();
                for(int i=0;i<size;i++){
                    int temp=q.poll();
                    res.add(temp);
                    visited[temp]=true;
                    for(int j=0;j<adj[temp].length;j++){
                        if(!visited[j] && adj[temp][j]==1){
                            q.offer(j);
                        }
                    }
                }
            }
        }
    }
    static void bfsUtil(int adj[][],List<Integer>res){
        boolean visited[]=new boolean[adj.length];
        for(int i=0;i<adj.length;i++){
            if(!visited[i]){
                bfs(adj, visited, res, i);
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
