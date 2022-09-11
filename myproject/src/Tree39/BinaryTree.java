package Tree39;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);
	public class Node
	{
		int data ;
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
// 10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 70 false false 	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.CreateTree();
		bt.display();
//		System.out.println(bt.ht());
//		bt.levelOrderNewLine();
		
		System.out.println(bt.max());
		System.out.println(bt.min());
		
//		System.out.println(bt.isBST());
		
		System.out.println(bt.isBST2());
		
	}
	
	public void CreateTree()
	{
		root = CreateTree(null,"");
	}
	private Node CreateTree(Node parent, String lr)
	{
		if(parent == null)
		{
			System.out.println("Enter the root node : ");
		}
		else
		{
			System.out.println("Enter the "+lr+" child of "+parent.data+ " : ");
		}
		int val = sc.nextInt();
		Node n = new Node(val); 
		System.out.println("Is there left child of "+n.data+" : ");
		
		boolean lc = sc.nextBoolean();
		
		if(lc)
		{
			n.left = CreateTree(n,"left");
		}
		System.out.println("Is there right child of "+n.data+" : ");
		
		 lc = sc.nextBoolean();
		
		if(lc)
		{
			n.right = CreateTree(n,"right");
		}
		return n;
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
		System.out.print("<---"+n.data+"--->");
		if(n.right != null)
		{
			System.out.print(n.right.data);
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
	
	public int ht()
	{
		return ht(this.root);
	}
	private int ht(Node n)
	{
		if(n == null)
		{
			return -1 ;
		}
		else
		{
			int ht  = Math.max(ht(n.left), ht(n.right));
			return ht+1;
		}
		
		
	}
	public void levelOrderNewLine() {

		// write your code here
		levelOrderNewLine(this.root);
	}

	private void levelOrderNewLine(Node n)
	{
		Queue<Node> qt1 = new LinkedList<>();
		Queue<Node> qt = new LinkedList<>();
		qt1.add(n);

		while(!qt1.isEmpty())
		{
			Node k = qt1.remove();
			if(k.left != null)
			{
				qt.add(k.left);
			}
			if(k.right != null)
			{
				qt.add(k.right);
			}
			System.out.print(k.data+" ");
			if(qt1.isEmpty())
			{
				System.out.println();
				qt1 = qt;
				qt = new LinkedList<>();
			}
		}

	}
// check binary is BST or not	
	public boolean isBST()
	{
		return isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean isBST(Node n,int low,int high)
	{
		if(n == null)
		{
			return true;
		}
		else
		{
			if(n.data < low||n.data > high)
			{
				return false;
			}
			else
			{
				return isBST(n.left,low,n.data) && isBST(n.right,n.data,high);
			}
		}
	}
	
	public int max()
	{
		return max(this.root);
	}
	private int max(Node n)
	{
		if(n== null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			return Math.max(n.data, Math.max(max(n.left),max(n.right)));
		}
	}
	
	public int min()
	{
		return min(this.root);
	}
	
	private int min(Node n)
	{
		if(n == null)
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return Math.min(n.data, Math.min(min(n.left), min(n.right)));
		}
	}
	
	public boolean isBST2()
	{
		return isBST2(this.root);
	}
	
	private boolean isBST2(Node n)
	{
		if(n == null)
		{
			return true;
		}
		else
		{
			boolean isb = true;
			isb = isb && isBST2(n.left);
			isb = isb && isBST2(n.right);
			if(isb)
			{
				int max = max(n.left);
				int min = min(n.right);
				
				if(n.data < max || n.data > min)
				{
					isb = false;
				}
			}
			return isb;
		}
	}
	
	
	
	
	
	
	
	
	

}
