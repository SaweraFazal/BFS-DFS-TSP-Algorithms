package laboratory14;
import java.io.*;
import java.util.*;
public class DepthFirst {
	private int V;  //number of nodes
	private LinkedList<Integer> adj[];  //adjacency list
	
	public DepthFirst(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i ) {
			adj[i] = new LinkedList();
		}
		
	}
	
	 void addEdge(int v, int w)
		 {
			adj[v].add(w);
		  }
	
	 void DFSUtil(int vertex, boolean nodes[]) {
		 nodes[vertex] = true;
		 System.out.println(vertex + " ") ;
		 int a = 0;
		 for (int i = 0; i<adj[vertex].size(); i++) {
			 a = adj[vertex].get(i);
			 if (!nodes[a]) {
				 DFSUtil(a,nodes);
			 }
		 }
	 }
	 
	 void DFS(int v) 
	 {
		 boolean already[] = new boolean[V];
		 DFSUtil (v,already);
	 }
	 
	 public static void main (String args[]) {
		 DepthFirst g = new DepthFirst(7);
		 g.addEdge(0, 1);
		 g.addEdge(1, 3);
		 g.addEdge(3, 1);
		 g.addEdge(1, 4);
		 g.addEdge(4, 1);
		 g.addEdge(1, 0);
		 g.addEdge(0, 2);
		 g.addEdge(2, 5);
		 g.addEdge(5, 2);
		 g.addEdge(2, 6);
		 
		 System.out.println("Following is Depth Fisrt Traversal: ");
		 g.DFS(0);
	 }
}
	
	