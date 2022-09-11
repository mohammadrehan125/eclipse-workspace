package Stack29;

import Inheritance28.DynamicStack;

public class actualReverse {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		DynamicStack st = new DynamicStack();
		for(int i = 1; i <= 5; i++)
			st.push(i);
		
		st.display();
		
		//actualR2(st);
		actualRfirst(st);
		st.display();
	}
	
	
	public static void actualR(DynamicStack st) throws Exception
	{
		DynamicStack temp1 = new DynamicStack();
		DynamicStack temp2 = new DynamicStack();
		
		while(!st.isEmpty())
		{
			temp1.push(st.pop());
		}
		while(!temp1.isEmpty())
		{
			temp2.push(temp1.pop());
		}
		while(!temp2.isEmpty())
		{
			st.push(temp2.pop());
		}
	}
	
	public static void actualR2(DynamicStack st)throws Exception
	{
		DynamicStack temp = new DynamicStack();
		while(!st.isEmpty())
		{
			temp.push(st.pop());
		}
		actualR2Helper(st, temp);
	}
	public static void actualR2Helper(DynamicStack st,DynamicStack temp)throws Exception
	{
		
		while(temp.isEmpty())
		{
			return;
		}
		
		int n = temp.pop();
		actualR2Helper(st, temp);
		st.push(n);
	}
	
	
	
	public static void actualRfirst(DynamicStack st)throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		
		int n = st.pop();
		actualRfirst(st);
		pushFirst(st, n);
		
	}
	
	public static void pushFirst(DynamicStack st,int n)throws Exception
	{
		while(st.isEmpty())
		{
			st.push(n);
			return;
		}
		 int t = st.pop();
		 pushFirst(st, n);
		 st.push(t);
	}
	
	
	

}
