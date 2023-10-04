import java.util.*;
public class SimpleDFS{
    static void dfs(int adj[][],int start,boolean visited[],List<Integer>res){
        res.add(start);
        visited[start]=true;
        for(int i=0;i<adj[start].length;i++){
            if(!visited[i] && adj[start][i]==1){
                dfs(adj, i, visited, res);
            }
        }
    }

    static void dfsUtil(int adj[][],List<Integer>res){
        boolean visited[]=new boolean[adj.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfs(adj, i, visited, res);
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
        dfsUtil(adj, res);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}