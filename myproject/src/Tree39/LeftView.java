package Tree39;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeftView {
	
	Scanner sc  =new Scanner(System.in);
	
	public static void main(String[] args) {
		LeftView lv = new LeftView();
		lv.createTree1();
		
		lv.leftview();
				
	}
	
	public class Node
	{
		int data;
		Node left,right;
		
		Node()
		{
			this(0);
		}
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	private Node root;

	public void createTree1()
	{
		int n = sc.nextInt();
		
		root = new Node(n);
		
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node k = qt.remove();
			
			int l= sc.nextInt();
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
	
	public void display()
	{
		display(this.root);
	}
	
	private void display(Node n)
	{
		if(n.left != null)
		{
			System.out.print(n.left.data);
		}
		System.out.print("<--- "+n.data+" --->");
		if(n.right != null)
		{
			System.out.print(n.right.data);
		}
		System.out.println();
		if(n.left!= null)
		{
			display(n.left);
		}
		if(n.right != null)
		{
			display(n.right);
		}
	}
	static int max_lvl ;
	public void leftview()
	{
		max_lvl = -1;
		leftview(this.root,0);
	}
	public void leftview(Node n,int lvl)
	{
		if(n == null)
		{
			return;
		}
		if(lvl > max_lvl)
		{
			max_lvl = lvl;
			System.out.print(n.data+" ");
		}
		
		leftview(n.left,lvl+1);
		leftview(n.right,lvl+1);
	}	
	public void levelOrderZZ() {
		
		// write your code here

		Queue<Node> qt = new LinkedList<>();
		Queue<Node> temp = new LinkedList<>();

		qt.add(root);
		int lvl = 0;
		while(!qt.isEmpty())
		{
			Node n = qt.remove();
			if(lvl%2 == 0)
			{
				if(n.left != null)
				{
					temp.add(n.left);
				}
				if(n.right != null)
				{
					temp.add(n.right);
				}	
			}
			else
			{
				if(n.right != null)
				{
					temp.add(n.right);
				}
				if(n.left != null)
				{
					temp.add(n.left);
				}
			}
			System.out.print(n.data+" ");
			while(qt.isEmpty())
			{
				lvl++;
				qt = temp;
				System.out.println();
				temp = new LinkedList<>();
			}
		}

	}
}
