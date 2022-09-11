package Stack29;

import Inheritance28.DynamicStack;

public class Stack_Reverse1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		DynamicStack st = new DynamicStack();
		for(int i = 1;i<=5;i++)
		{
			st.push(i);
		}
		st.display();
		
		//StackR(st);
		ReverseR(st);
		System.out.println();
		st.display();

	}
	
	public static void StackR(DynamicStack st) throws Exception
	{
		DynamicStack temp = new DynamicStack();
		
		while(!st.isEmpty())
		{
			temp.push(st.pop());
		}
		
	//	temp.display();
		
		while(!temp.isEmpty())
		{
			int n = temp.pop();
			System.out.print(n+" ");
			st.push(n);
		}
	}
// Recursion
	
	public static void ReverseR(DynamicStack st)throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		int n = st.pop();
		
		ReverseR(st);
		System.out.print(n+" ");
		st.push(n);
		
		

	}
	

}
