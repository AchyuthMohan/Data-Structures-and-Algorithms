import java.util.*;

public class SimpleDFS {
    static void dfs(int adj[][],boolean visited[],int start,List<Integer>res){
        res.add(start);
        visited[start]=true;
        for(int i=0;i<adj[start].length;i++){
            if(adj[start][i]==1 && !visited[i]){
                dfs(adj, visited, i, res);
            }
        }
    }
    static void dfsUtil(int adj[][],boolean visited[],List<Integer>res){
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfs(adj, visited, i, res);
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
        boolean visited[]=new boolean[5];
        dfsUtil(adj, visited, res);
        for(int i:res){
            System.out.print(i+" ");
        }

    }
}
