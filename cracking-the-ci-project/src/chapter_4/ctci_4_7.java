package chapter_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

//Converted the question to the essence, topological sort

public class ctci_4_7 {
	
	public static void main(String args[]) {
        Graph g = new Graph(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        g.topologicalSort(); 
	}
}

class Graph{
	int v;
	LinkedList<Integer> adj[];
	
	Graph(int V){
		v = V;
		adj = new LinkedList[v];
		
		for(int i=0; i<v ;i++) {
			adj[i] = new LinkedList();
		}
	}
	
	public void topologicalSort() {
		Stack stack = new Stack();
		
		boolean visited[] = new boolean[v];
		
		for(int i=0; i<v; i++) {
			visited[i] = false;
		}
		
		for(int i=0 ; i<v; i++) {
			if(visited[i] == false) {
				topologicalSortUtil(i,visited,stack);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
		
	}

	private void topologicalSortUtil(int i, boolean[] visited, Stack stack) {
		visited[i] = true;
		
		Integer temp;
		
		Iterator<Integer> it = adj[i].iterator();
		
		while(it.hasNext()) {
			temp = it.next();
			
			if(!visited[temp]) {
				topologicalSortUtil(temp,visited,stack);
			}
		}
		
		stack.push(i);
		
	}

	void addEdge(int e1,int e2) {
		adj[e1].add(e2);
	}

}