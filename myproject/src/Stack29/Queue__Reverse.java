package Stack29;

import Inheritance28.DynamicQueue;
import Inheritance28.DynamicStack;

public class Queue__Reverse {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		DynamicQueue qt = new DynamicQueue();
		
		for(int i = 1;i <=5;i++)
		{
			qt.enqueue(i);
		}
		
		qt.display();
		
		//ReverseQueue(qt);
//		reverseR(qt);
		//System.out.println();
		reverseR2(qt,qt.size());
		System.out.println();
		qt.display();

	}
	
	public static void ReverseQueue(DynamicQueue qt)throws Exception
	{
		DynamicStack st = new DynamicStack();
		while(!qt.isEmpty())
		{
			st.push(qt.dequeue());
		}
		
		while(!st.isEmpty())
		{
			qt.enqueue(st.pop());
		}
	}
// recursion
	public static void reverseR(DynamicQueue qt)throws Exception
	{
		if(qt.isEmpty())
		{
			return;
		}
		
		int n = qt.dequeue();
		
		reverseR(qt);
		System.out.print(n+" ");
		qt.enqueue(n);
				
	}
// Recursion2	
	public static void reverseR2(DynamicQueue qt,int size)throws Exception
	{
		if(size == 0)
		{
			return;
		}
		
		int n = qt.dequeue();
		qt.enqueue(n);
		reverseR2(qt,size-1);
		System.out.print(n+" ");
		
				
	}
	

}
