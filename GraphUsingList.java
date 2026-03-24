// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class GraphUsingList {
    public static void main(String[] args) {
        int n =9;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        //1<-->2
       insert(graph,1,2);
       insert(graph,1,6);
       insert(graph,2,3);
       insert(graph,2,4);
       insert(graph,4,5);
       insert(graph,5,8);
       insert(graph,6,7);
       insert(graph,6,9);
       insert(graph,7,8);
    //   insert(graph,);
    //   insert(graph,4,2);
       
        // System.out.println(graph);
        printGraph(graph,n);
       
    }
       
    static void insert(List<List<Integer>> graph,int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static void printGraph(List<List<Integer>> graph, int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
        
}