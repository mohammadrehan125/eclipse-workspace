package LinkedList32;


public class ReverseLL {
	
	class Node{
		int data;
		Node next;
		
		Node()
		{
			this(0);
		}
		
		Node(int data)
		{
			this.data = data;
			next = null;
			
		}
		Node(int data,Node n)
		{
			this.data = data;
			this.next = n;
		}
	}

	public static void main(String[] args) {
		
		ReverseLL l1 = new ReverseLL();
		
//		l1.addfirst(2);
		for(int i = 1;i<= 5;i++)
			l1.addlast(i);
		l1.display();
		l1.reveseR();
		l1.display();

	}
	
	public void addfirst(int ele)
	{
		Node n = new Node(ele,head);
		head = n;
	}
	public void addlast(int ele)
	{
		Node temp = head;
		if(head == null)
		{
			addfirst(ele);
			return;
		}
		while(temp.next != null)
		{
			temp = temp.next;
		}
		Node n = new Node(ele,null);
		temp.next = n;
	}
	public void display()
	{
		Node temp= head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	private Node head;
	private Node tail;
	private int size; 
	public void reveseR()
	{
		reverse(head,null);
	}
	public void reverse(Node cur,Node prev)
	{
		if(cur == null)
		{
			head = prev;
			return ;
		}
		reverse(cur.next, cur);
		cur.next = prev;
	}
	

}
