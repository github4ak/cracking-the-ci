package chapter_04;

import java.util.Iterator;
import java.util.LinkedList;

public class ctci_4_1 {
    private int V;
    private LinkedList<Integer> adj[];
    
    @SuppressWarnings("unchecked")
	ctci_4_1(int v){
        V = v;
        adj = new LinkedList[v];
        
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    
    void addEdge(int u,int v){
        adj[u].add(v);
    }
    
    boolean isReachable(int v, int w){
        boolean visited[] = new boolean[V];
        
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        
        Iterator<Integer> i;
        
        while(!queue.isEmpty()){
            v = queue.poll();
            
            int n;
            
            i = adj[v].listIterator();
            
            while(i.hasNext()){
                n = i.next();
                
                if(n == w){
                    return true;
                }
                
                if(!visited[n]){
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String args[]){
    ctci_4_1 g = new ctci_4_1(4); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        int u = 1; 
        int v = 3; 
        if (g.isReachable(u, v)) 
            System.out.println("There is a path from " + u +" to " + v); 
        else
            System.out.println("There is no path from " + u +" to " + v);; 
    }
	
}