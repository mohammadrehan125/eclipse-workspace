package LinkedList32;

public class MyLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node()
		{
			this(0);
		}
		
		Node(int data)
		{
//			this.data = data;
//			next = null;
	// OR
			this(data,null);
			
		}
		Node(int data,Node n)
		{
			this.data = data;
			this.next = n;
		}
	}
	private Node head;
	private Node tail;
	private int size;
	
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	public void addFirst(int ele)
	{
		Node n = new Node(ele,head);
		head = n;
	}
	
	public int size()
	{
		int count = 0;
		Node temp = head;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
//	public void addLast(int ele)
//	{
//		if(head == null)
//		{
//			addFirst(ele);
//			return;
//		}
//		Node temp = head;
//		while(temp.next != null)
//		{
//			temp = temp.next;
//		}
//		Node n = new Node(ele,null);
//		temp.next = n;		
//	}
	
	// 2nd Method
	public void addLast(int ele)
	{
		if(head == null)
		{
			addFirst(ele);
			return;
		}
		Node temp = getNodeAt(size()-1);
		
		Node n  = new Node(ele,null);
		temp.next = n;		
	}
	
	public void addAt(int ele,int id)throws Exception
	{
		if(id < 0 || id >= size()-1)
		{
			throw new Exception("Invalid Index");
		}
		if(id == 0)
		{
			addFirst(ele);
		}
//		Node temp = head;
////		while(id > 1)
////		{
////			temp = temp.next;
////			id--;
////		}
	//2nd Method
		Node temp = getNodeAt(id-1);
		Node n= new Node(ele,temp.next);
		temp.next = n;
	}
//O(1)	
	public int getFirst()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		return head.data;
	}
//O(n)	agr tail hota to O(1) ho jati
	public int getLast()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		Node temp = getNodeAt(size()-1);
		return temp.data;
		
	}
//O(n)	
	public int getAt(int id)throws Exception
	{
		if(id < 0 || id >= size()-1)
		{
			throw new Exception("Invalid Index");
		}
		Node temp = getNodeAt(id);
		return temp.data;
	}
	
	private Node getNodeAt(int id)
	{
		Node temp = head;
		while(id > 0)
		{
			temp = temp.next;
			id--;
		}
		return temp;
	}
	
	public int removefirst()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		int td = head.data;
		head = head.next;
		return td;
	}
	public int removeLast()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		
		if(size() == 1)
		{
			return removefirst();
		}
		
		Node temp = getNodeAt(size()-2);
		int td = temp.next.data;
		temp.next = null;
		return td;
		
	}
	public int removeAt(int id)throws Exception
	{
		if(id < 0 || id >= size()-1)
		{
			throw new Exception("Invalid Index");
		}
		
		Node temp = getNodeAt(id-1);
		int td = temp.next.data;
		temp.next = temp.next.next;
		return td;
	}
	
	
	
	
	

}
