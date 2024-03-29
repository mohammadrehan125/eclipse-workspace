package lacture32;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 3 20 2 50 0 60 0 30 0 40 1 70 0
		GenericTree gt = new GenericTree();
		gt.createTree();
		gt.display();
		System.out.println(gt.size());
		System.out.println(gt.ht());
	}
	Scanner sc = new Scanner(System.in);
	private class Node
	{
		int data;
		ArrayList<Node>children;
		Node(int val)
		{
			data = val;
			children = new ArrayList<>();
		}
		Node()
		{
			this(0);
		}
	}
	private Node root;
	
	public void createTree() 
	{
	    root = createTree(null,-1);
		
	}
	
	private Node createTree(Node parent,int ith)
	{
		if(parent == null)
		{
			System.out.println("Enter root node value: ");
		}
		else
		
			System.out.println("Enter thr value of "+ith+"th child of "+parent.data);
			
		int val = sc.nextInt();
		Node n = new Node(val);
		System.out.println("Enter the no. of children for this node :");
		int noc = sc.nextInt();
		for(int i = 0; i < noc; i++)
		{
			Node child = createTree(n,i);
			n.children.add(child);
		}
		return n;
		
	}
	
	public void display()
	{
		display(root);
	}
	
	private void display(Node n)
	{
		System.out.print(n.data+"---> ");
		for(int i = 0; i< n.children.size(); i++)
		{
			System.out.print(n.children.get(i).data+" ");
		}
		System.out.println();
		for(Node child:n.children)
		{
			display(child);
		}
	}
	public int size() {
		return size(this.root);
	}
	private int size(Node n)
	{
		int count = 0;
		for(Node child:n.children)
		{
			count += size(child);
		}
		return count+1;
	}
	public int ht()
	{
		return ht(this.root);
	}
	private int ht(Node n)
	{
		int ht = 0;
		for(Node child : n.children)
		{
			int t = ht(child);
			ht = Math.max(t, ht);
		}
		return ht+1;
	}

}
