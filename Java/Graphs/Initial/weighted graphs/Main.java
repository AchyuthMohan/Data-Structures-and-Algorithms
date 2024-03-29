import java.util.*;
public class Main{
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,5,3));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,2,2));
        graph[5].add(new Edge(5,1,3));
        graph[1].add(new Edge(1,3,2));
        graph[1].add(new Edge(1,2,1));
        graph[2].add(new Edge(2,4,1));
        graph[1].add(new Edge(1,3,2));
        graph[4].add(new Edge(4,3,3));
        graph[3].add(new Edge(3,4,3));
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>graph[]=new ArrayList[6];
        createGraph(graph);

        for(int i=0;i<graph.length;i++){
           ArrayList<Edge> temp=graph[i];
           int size=temp.size();
           for(int j=0;j<size;j++){
            Edge node=temp.get(j);
            System.out.print("Src: "+node.src+"Dest: "+node.dest+"Weight: "+node.wt);
            System.out.println(" ");
           }
           System.out.println("");
        }
    }
}