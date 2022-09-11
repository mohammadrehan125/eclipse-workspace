package LinkedList32;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		MyLinkedList ll = new MyLinkedList();
		
		for(int i = 5;i > 0;i--)
		{
			ll.addFirst(i);
			ll.display();
		}
		ll.addAt(0, 2);
		ll.display();
		
		System.out.println(ll.getAt(0));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.removeAt(2);
		ll.display();

	}

}
