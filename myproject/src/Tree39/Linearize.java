package Tree39;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Linearize {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Linearize ll = new Linearize();
		ll.createTree();
		ll.Linearize();
		ll.display();
	}
	
	public class Node
	{
		int data ;
		Node left,right;
		
		Node()
		{
			
		}
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	private Node root;
	
	private void createTree()
	{
		int n = sc.nextInt();
		
		root = new Node(n);
		Queue<Node> qt = new LinkedList<>();
		
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node k = qt.remove();
			
			int l = sc.nextInt();
			int r = sc.nextInt();
			if(l != -1)
			{
				k.left = new Node(l);
				qt.add(k.left);
			}
			if(r != -1)
			{
				k.right = new Node(r);
				qt.add(k.right);
			}
		}
	}
	
	public void Linearize()
	{
		Linearize(this.root);
	}
	private void Linearize(Node n)
	{
		if(n == null)
		{
			return ;
		}
		else
		{
			Linearize(n.left);
			Linearize(n.right);
			
			Node k = getleftMostNode(n);
			k.left = n.right;
			n.right = null;
			
		}
	}
	
	private Node getleftMostNode(Node n)
	{
		if(n.left == null)
		{
			return n;
		}
		else
		{
			return getleftMostNode(n.left);
		}
	}
	
	public void display()
	{
		display(this.root);
	}
	private void display(Node n)
	{
		if(n.left != null)
		{
			System.out.print(n.left.data +" ");
		}
		System.out.print("<---- "+n.data+" ----->");
		if(n.right != null)
		{
			System.out.print(n.right.data+" ");
		}
		System.out.println();
		if(n.left != null)
		{
			display(n.left);
		}
		if(n.right != null)
		{
			display(n.right);
		}
	}	

	
}
