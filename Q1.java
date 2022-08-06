package laboratory14;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
public class Q1 {
	private int V; //number of nodes in the graph
	 private LinkedList<Integer> adj[]; //adjacency list
	 private Queue<Integer> queue; //maintaining a queue
	 Q1(int v)
	 {
	 V = v;
	 adj = new LinkedList[v];
	 for (int i=0; i<v; i++)
	 {
	 adj[i] = new LinkedList<>();
	 }
	 queue = new LinkedList<Integer>();
	 }
	 void addEdge(int v,int w){
		 //adding an edge to the adjacency list (edges are bidirectional in this example)
		    adj[v].add(w);
	 }
	
		 void BFS(int n) {
		 
		 boolean nodes[] = new boolean[V]; //initialize boolean array for 
		//holding the data
		 int a = 0;
		 nodes[n]=true; 
		 queue.add(n); //root node is added to the top of the queue
		 while (queue.size() != 0)
		 {
		 n = queue.poll(); //remove the top element of the queue
		 System.out.print(n+" "); //print the top element of the queue
		 for (int i = 0; i < adj[n].size(); i++) //iterate through the linked 
		//list and push all neighbors into queue
		 {
		 a = adj[n].get(i);
		 if (!nodes[a]) //only insert nodes into queue if 
		//they have not been explored already
		 {
		 nodes[a] = true;
		 queue.add(a);
		 }
		 } 
		 }
}

			 void DFSUtil(int vertex, boolean nodes[]) {
				 nodes[vertex] = true;
				 System.out.print(vertex + " ") ;
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
			 public static void main(String args[]) {
				 Q1 g = new Q1(13);
				 g.addEdge(1, 2);
				 g.addEdge(2, 3);
				 g.addEdge(3, 4);
				 g.addEdge(4, 3);
				 g.addEdge(3, 5);
				 g.addEdge(5, 3);
				 g.addEdge(3, 2);
				 g.addEdge(2, 6);
				 g.addEdge(6, 2);
				 g.addEdge(2, 1);
				 g.addEdge(1, 7);
				 g.addEdge(7, 1);
				 g.addEdge(1, 8);
				 g.addEdge(8, 9);
				 g.addEdge(9, 10);
				 g.addEdge(10, 9);
				 g.addEdge(9, 11);
				 g.addEdge(11, 9);
				 g.addEdge(9,  8);
				 g.addEdge(8, 12);
				 g.addEdge(12, 8);
				 g.addEdge(8, 1);
				 
				
				 System.out.println("Following is Depth Fisrt Traversal: ");
				 g.DFS(1);
				 
				 System.out.println();
				 System.out.println("Following is Breath Fisrt Traversal: ");
				 g.BFS(1);
				 
			 }
			 }

