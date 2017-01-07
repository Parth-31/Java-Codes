import java.util.*;

public class Graph {
	private int V;
	private LinkedList<Integer> adj[];
	
	Graph(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++){
			adj[i] = new LinkedList();
		}
	}
		
	void addEdge(int v,int w){   
		adj[v].add(w);   
	}
	public boolean isReachable(int s, int d){
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		Iterator<Integer> i;
		while(!queue.isEmpty()){
			s = queue.poll();
			
			i = adj[s].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(n == d)
					return true;
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}
		}
		return false;
	}
		 
	public static void main(String[] args){
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		if(g.isReachable(1,3))
			System.out.println("Hell Yeah!");
		else
			System.out.println("Sadly No!");
	}
	
	
}
