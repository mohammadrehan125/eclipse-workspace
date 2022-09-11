package LinkedList32;

public class InterSectionOfTwoLL {
	
	class Node{
		
		int data;
		Node next;
		
		Node()
		{
			
		}
		Node(int data)
		{
			this.data = data;
			next = null;
		}
//		Node(int data,Node n)
//		{
//			this.data = data;
//			this.next = n;
//			
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterSectionOfTwoLL ll = new InterSectionOfTwoLL();
		
		ll.dummyListIntersection();
		
		
		

	}
	public void dummyListIntersection()
	{
		Node head1 = null;
		Node head2 = null;
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		Node n11 = new Node(11);
		Node n12 = new Node(12);
		Node n13 = new Node(13);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = null;
		n11.next = n12;
		n12.next = n13;
		n13.next = n7;
		
		head1 = n1;
		head2 = n11;
		
		intrsection(head1, head2);
		Node i = intersectionOfTwoLinkedLists(head1, head2);
		System.out.println(i.data);
	}
	
	private void intrsection(Node head1, Node head2)
	{
		Node s1 = head1;
		Node s2 = head2;
		
		while(s1 != s2)
		{
			if(s1 == null)
			{
				s1 = head2;
			}
			if(s2 == null)
			{
				s2 = head1;
			}
			
			s1 = s1.next;
			s2 = s2.next;
		}
		
		System.out.println(s1.data);
	}
	
	Node intersectionOfTwoLinkedLists(Node l1, Node l2) {
        /* Code here */
        Node s1 = l1;
		Node s2 = l2;
		
		if(s1 == null || s2 == null)
		{
			return null;
		}
		
		while(s1 != s2)
		{
            s1 = s1.next;
			s2 = s2.next;
//            if(s1==s2)
//            {
//                return s1;
//            }
			if(s1 == null)
			{
				s1 = l1;
			}
			if(s2 == null)
			{
				s2 = l2;
			}
			
			
		}
		return s1;
    }
	
	
	
	
	
	
	
	
	
	

}
