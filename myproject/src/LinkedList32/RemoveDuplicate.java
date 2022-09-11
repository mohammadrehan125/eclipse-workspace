package LinkedList32;

import java.util.LinkedList;

public class RemoveDuplicate {
	
	public class Node{
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
	}
	Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList<Integer> ll = new LinkedList<>();
//
//		ll.addLast(12);
//		ll.addLast(15);
//		ll.addLast(10);
//		ll.addLast(11);
//		ll.addLast(6);
//		ll.addLast(2);
//		ll.addLast(3);
//		
		int [] arr = {3,2,1,5,6,4};
		second(arr,3);
		
		
		
		

	}
	 public static void second(int arr[],int n)
	    {
	        for(int i = 0;i<arr.length;i++)
	        {
	            for(int j = i+1;j <arr.length-1;j++)
	            {
	                if(arr[i] < arr[j])
	                {
	                    int t = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = t;
	                }
	            }
	            if(i == n-1)
	            {
	                System.out.println(arr[i]);
	                break;
	            }
	        }
	    }
	public void eleteLarger()
	{
		deleteLarger(this.head);
	}
	private Node deleteLarger(Node head)
	{
		Node temp = head;
		if(head == null)
		{
			return head;
		}
		while(temp.next != null)
		{
			if(temp.data < temp.next.data)
			{
				temp.data = temp.next.data;
				temp.next = temp.next.next;
			}
			else{
				temp = temp.next;
			}
		}
		return head;
	}
	public Node duplicate()
	{
		Node prev = head;
		Node temp = head.next;
		
		if(head == null)
		{
			return null;
		}
		while(temp != null&&prev.next != null)
		{
			if(prev.data == temp.data)
			{
				prev.next = temp.next;
				prev = prev.next;
				temp = prev.next;
			}
			else
			{
				prev = prev.next;
				temp = temp.next;
			}
		}
		return head;
	}
	
	

}
