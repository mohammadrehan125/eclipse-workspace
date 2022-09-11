package Tree39;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree2 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		BinaryTree2 ll = new BinaryTree2();
		
		ll.createTree();
		ll.display();
//		System.out.println(ll.sum());
	}
	public class Node{
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
	// 1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1
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
	
	public int sum()
	{
		return sum(this.root);
	}
	private int sum(Node n)
	{
		if(n == null)
		{
			return 0;
		}	
		return (n.data+sum(n.left)+sum(n.right));
	}

}
