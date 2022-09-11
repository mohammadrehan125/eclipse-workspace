package LinkedList32;

public class MiddlePointLL {
	
	class Node{
		
		int data;
		Node next;
		Node(){
			
		}
		Node(int data)
		{
			this.data = data;
			next = null;
		}
		Node(int data,Node n)
		{
			this.data = data;
			next = n;
		}
	}
	static Node head;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiddlePointLL ll = new MiddlePointLL();
		
//		ll.addfirst(1);
//		ll.addfirst(2);
		ll.addlast(1);
		ll.addlast(2);
		ll.addlast(3);
		ll.addlast(4);
		ll.addlast(5);
		ll.addlast(6);
		System.out.println(ll.Mid());

	}
	
	public static int Mid()
	{
		Node slow = head;
		Node fast = head;
		
		while(fast != null&&fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public void addfirst(int ele)
	{
		Node n = new Node(ele,head);
		head = n;
		
	}
	public void addlast(int ele)
	{
		if(head == null)
		{
			addfirst(ele);
			return;
		}
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		Node n = new Node(ele,null);
		temp.next = n;
	}
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
