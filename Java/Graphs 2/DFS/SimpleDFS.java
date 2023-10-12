import java.util.*;

public class SimpleDFS {
    static void dfs(int adj[][],boolean visited[],List<Integer>res,int start){
        if(!visited[start]){
            res.add(start);
            visited[start]=true;
            for(int i=0;i<adj[start].length;i++){
                if(!visited[i] && adj[start][i]==1){
                    dfs(adj, visited, res, i);
                }
            }
        }
    }
    static void dfsUtil(int adj[][],List<Integer>res){
        boolean visited[]=new boolean[adj.length+1];
        for(int i=0;i<adj.length;i++){
            if(!visited[i]){
                dfs(adj, visited, res, i);
            }
        }
    }
    public static void main(String[] args) {
        int adj[][]=new int[5][5];
        adj[0][1]=1;
        adj[0][2]=1;
        adj[0][3]=1;
        adj[0][4]=1;
        adj[1][0]=1;
        adj[2][0]=1;
        adj[3][0]=1;
        adj[4][0]=1;
        List<Integer>res=new ArrayList<>();
        dfsUtil(adj, res);
        for(int i:res){
            System.out.print(i+" ");
        }

    }
}
