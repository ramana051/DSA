import java.util.*;
class GraphBFS {
    public static void main(String[] args) {
        List<List<Integer>> g= new ArrayList<>();
        int n=9;
        int visited[]= new int[n+1];
        Queue<Integer> q= new LinkedList<>();
        for(int i =0;i<=n;i++){
            g.add(new ArrayList<>());
        }
        
        insert(g,1,2);
        insert(g,1,6);
        insert(g,2,3);
        insert(g,2,4);
        insert(g,4,5);
        insert(g,5,8);
        insert(g,6,7);
        insert(g,6,9);
        insert(g,7,8);
        
        List<Integer> bfs=new ArrayList<>();
        q.offer(1);
        visited[1]=1;
        while(!q.isEmpty()){
            int firstElement=q.remove();
            visited[firstElement]=1;
            bfs.add(firstElement);
                for(int i :g.get(firstElement)){
                    if(visited[i]!=1){
                        q.offer(i);
                        visited[i]=1;
                    } 
                }
            
        }
        display(g,n);
        System.out.println(bfs);
    }
    
    static void insert(List<List<Integer>> g,int u , int v){
        g.get(u).add(v);
        g.get(v).add(u);
    }
    static void display(List<List<Integer>> g,int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+"->");
            for(int j:g.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}