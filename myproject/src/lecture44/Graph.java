package lecture44;

import java.util.HashMap;

public class Graph {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Graph gp = new Graph(7);
		gp.addEdge(1, 2, 10);
		gp.addEdge(1, 4, 60);
		gp.addEdge(2,3, 20);
		gp.addEdge(3, 4, 30);
		gp.addEdge(4,5, 80);
		gp.addEdge(5, 6, 90);
		gp.addEdge(6, 7, 13);
		gp.addEdge(5, 7, 14);

		gp.Display();
	//	gp.removeEdge(4, 5);
		//gp.removeEdge(4, 5);
	//	gp.removeVertex(4);
	//	System.out.println("------------------");
		//gp.Display();
		gp.removeVertex(4);   
		System.out.println("------------------");
		gp.Display();
		System.out.println(gp.containsEdge(4,5));

	}
	HashMap<Integer, HashMap<Integer,Integer>> graph = new HashMap<>();

	public Graph(int v)
	{
		for(int i = 1; i <= v; i++)
		{
			graph.put(i,new HashMap<>());
		}
	}
	public void addEdge(int u,int v, int cost)
	{
		graph.get(u).put(v, cost);
		graph.get(v).put(u, cost);
		
	}
	
	public void addVertex(int v)
	{
		graph.put(v, new HashMap<>());
	}
	
	public void removeEdge(int u,int v)
	{
		if(containsEdge(u,v))
		{
			graph.get(u).remove(v);
			graph.get(v).remove(u);
		}
	}
	public boolean containsEdge(int u, int v) {
	
		return graph.get(u).containsKey(v) && graph.get(v).containsKey(u);
	}
	
	public void removeVertex(int v)
	{
		if(graph.containsKey(v))
		{
			for(int nbbr : graph.get(v).keySet())
			{
				graph.get(nbbr).remove(v);
			}
		}
	}
	
	public boolean containsVertex(int v)
	{
		return graph.containsKey(v);
	}
	
	public void Display()
	{
		for(int v : graph.keySet())
		{
			System.out.println(v+" : "+graph.get(v));
		}
	}
	
}
