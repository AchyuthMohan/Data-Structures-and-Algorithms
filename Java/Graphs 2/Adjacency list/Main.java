import java.util.*;
public class Main{
    static class Edge{
        int src,dest,wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void main(String[] args) {
        int v=5;
        Scanner sc=new Scanner(System.in);
        ArrayList<Edge>graph[]=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
            int src,dest,wt;
            System.out.println("Source: ");
            src=sc.nextInt();
            System.out.println("dest: ");
            dest=sc.nextInt();
            System.out.println("Wt: ");
            wt=sc.nextInt();
            Edge temp=new Edge(src,dest,wt);
            graph[i].add(temp);
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                System.out.println("Src: "+graph[i].get(j).src+" Dest: "+graph[i].get(j).dest+" WT: "+graph[i].get(j).wt);
            }
        }
    }
}