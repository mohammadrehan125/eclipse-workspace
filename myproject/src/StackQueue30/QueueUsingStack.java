package StackQueue30;
import Inheritance28.DynamicStack;

public class QueueUsingStack {
	DynamicStack st = new DynamicStack();
	
	public void enqueue(int n)throws Exception
	{
		addFirst(st, n);
	}
	
	public void addFirst(DynamicStack st,int n)throws Exception
	{
		if(st.isEmpty())
		{
			st.push(n);
			return;
		}
		int i = st.pop();
		addFirst(st, n);
		st.push(i);
				
	}
	public void dequeue()throws Exception
	{
		st.pop();
	}
	public int peek()throws Exception
	{
		return st.peek();
	}
	public int size()throws Exception
	{
		return st.size();
	}
	public boolean isFull()throws Exception
	{
		return st.isFull();
	}
	public boolean isEmpty()throws Exception
	{
		return st.isEmpty();
	}
	public void display()throws Exception
	{
		st.display();
	}
	
}
